/**
 * Copyright 2011 The Open Source Research Group,
 *                University of Erlangen-N��rnberg
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

import org.sweble.wikitext.engine.Page;
import org.sweble.wikitext.engine.PageTitle;
import org.sweble.wikitext.engine.utils.EntityReferences;
import org.sweble.wikitext.engine.utils.SimpleWikiConfiguration;
import org.sweble.wikitext.lazy.LinkTargetException;
import org.sweble.wikitext.lazy.encval.IllegalCodePoint;
import org.sweble.wikitext.lazy.parser.Bold;
import org.sweble.wikitext.lazy.parser.ExternalLink;
import org.sweble.wikitext.lazy.parser.HorizontalRule;
import org.sweble.wikitext.lazy.parser.ImageLink;
import org.sweble.wikitext.lazy.parser.InternalLink;
import org.sweble.wikitext.lazy.parser.Italics;
import org.sweble.wikitext.lazy.parser.MagicWord;
import org.sweble.wikitext.lazy.parser.Paragraph;
import org.sweble.wikitext.lazy.parser.Section;
import org.sweble.wikitext.lazy.parser.Table;
import org.sweble.wikitext.lazy.parser.TableCaption;
import org.sweble.wikitext.lazy.parser.TableCell;
import org.sweble.wikitext.lazy.parser.TableHeader;
import org.sweble.wikitext.lazy.parser.TableRow;
import org.sweble.wikitext.lazy.parser.Url;
import org.sweble.wikitext.lazy.parser.Whitespace;
import org.sweble.wikitext.lazy.parser.XmlElement;
import org.sweble.wikitext.lazy.preprocessor.TagExtension;
import org.sweble.wikitext.lazy.preprocessor.Template;
import org.sweble.wikitext.lazy.preprocessor.TemplateArgument;
import org.sweble.wikitext.lazy.preprocessor.TemplateParameter;
import org.sweble.wikitext.lazy.preprocessor.XmlComment;
import org.sweble.wikitext.lazy.utils.XmlAttribute;
import org.sweble.wikitext.lazy.utils.XmlAttributeGarbage;
import org.sweble.wikitext.lazy.utils.XmlCharRef;
import org.sweble.wikitext.lazy.utils.XmlEntityRef;

import CSVtoFML.CSVWriter;
import Exceptions.NotValidCSVFileException;
import de.fau.cs.osr.ptk.common.Visitor;
import de.fau.cs.osr.ptk.common.ast.AstNode;
import de.fau.cs.osr.ptk.common.ast.NodeList;
import de.fau.cs.osr.ptk.common.ast.Text;
import de.fau.cs.osr.utils.StringUtils;

/**
 * A visitor to convert an article AST into a pure text representation. To
 * better understand the visitor pattern as implemented by the Visitor class,
 * please take a look at the following resources:
 * <ul>
 * <li>{@link http://en.wikipedia.org/wiki/Visitor_pattern} (classic pattern)</li>
 * <li>{@link http://www.javaworld.com/javaworld/javatips/jw-javatip98.html}
 * (the version we use here)</li>
 * </ul>
 * 
 * The methods needed to descend into an AST and visit the children of a given
 * node <code>n</code> are
 * <ul>
 * <li><code>dispatch(n)</code> - visit node <code>n</code>,</li>
 * <li><code>iterate(n)</code> - visit the <b>children</b> of node
 * <code>n</code>,</li>
 * <li><code>map(n)</code> - visit the <b>children</b> of node <code>n</code>
 * and gather the return values of the <code>visit()</code> calls in a list,</li>
 * <li><code>mapInPlace(n)</code> - visit the <b>children</b> of node
 * <code>n</code> and replace each child node <code>c</code> with the return
 * value of the call to <code>visit(c)</code>.</li>
 * </ul>
 */
// AM: I give up with this kind of Visitor
@Deprecated
public class TextConverter
	extends 
		Visitor
        
{
	private static final Pattern ws = Pattern.compile("\\s+");
	
	private final SimpleWikiConfiguration config;
	
	private final int wrapCol;
	
	private StringBuilder sb;
	
	private StringBuilder line;
	
	private int extLinkNum;
	
	private boolean pastBod;
	
	private int needNewlines;
	
	private boolean needSpace;
	
	private boolean noWrap;
	
	private LinkedList<Integer> sections;
	
	// =========================================================================
	
	
	public TextConverter(SimpleWikiConfiguration config, int wrapCol)
	{
		this.config = config;
		this.wrapCol = wrapCol;
	}
	
	@Override
	protected boolean before(AstNode node)
	{
		// This method is called by go() before visitation starts
		sb = new StringBuilder();
		line = new StringBuilder();
		extLinkNum = 1;
		pastBod = false;
		needNewlines = 0;
		needSpace = false;
		noWrap = false;
		sections = new LinkedList<Integer>();
		return super.before(node);
	}
	
	@Override
	protected Object after(AstNode node, Object result)
	{
		finishLine();
		
		// This method is called by go() after visitation has finished
		// The return value will be passed to go() which passes it to the caller
		return sb.toString();
	}
	
	// =========================================================================
	
	public void visit(AstNode n)
	{
		// Fallback for all nodes that are not explicitly handled below
		write("<");
		write(n.getNodeName());
		write(" />");
	}
	
	public void visit(NodeList n)
	{
		iterate(n);
	}
	
	public void visit(Page p)
	{
		iterate(p.getContent());
	}
	
	public void visit(Text text)
	{
		write(text.getContent());
	}
	
	public void visit(Whitespace w)
	{
		write(" ");
	}
	
	public void visit(Bold b)
	{
		write("**");
		iterate(b.getContent());
		write("**");
	}
	
	public void visit(Italics i)
	{
		write("//");
		iterate(i.getContent());
		write("//");
	}
	
	
	public void visit(XmlCharRef cr)
	{
		write(Character.toChars(cr.getCodePoint()));
	}
	
	public void visit(XmlEntityRef er)
	{
		String ch = EntityReferences.resolve(er.getName());
		if (ch == null)
		{
			write('&');
			write(er.getName());
			write(';');
		}
		else
		{
			write(ch);
		}
	}
	
	public void visit(Url url)
	{
		write(url.getProtocol());
		write(':');
		write(url.getPath());
	}
	
	public void visit(ExternalLink link)
	{
		write('[');
		write(extLinkNum++);
		write(']');
	}
	
	public void visit(InternalLink link)
	{
		try
		{
			PageTitle page = PageTitle.make(config, link.getTarget());
			if (page.getNamespace().equals(config.getNamespace("Category")))
				return;
		}
		catch (LinkTargetException e)
		{
		}
		
		write(link.getPrefix());
		if (link.getTitle().getContent() == null
		        || link.getTitle().getContent().isEmpty())
		{
			write(link.getTarget());
		}
		else
		{
			iterate(link.getTitle());
		}
		write(link.getPostfix());
	}
	
	public void visit(Section s)
	{
		finishLine();
		StringBuilder saveSb = sb;
		boolean saveNoWrap = noWrap;
		
		sb = new StringBuilder();
		noWrap = true;
		
		iterate(s.getTitle());
		finishLine();
		String title = sb.toString().trim();
		
		sb = saveSb;
		
		if (s.getLevel() >= 1)
		{
			while (sections.size() > s.getLevel())
				sections.removeLast();
			while (sections.size() < s.getLevel())
				sections.add(1);
			
			StringBuilder sb2 = new StringBuilder();
			for (int i = 0; i < sections.size(); ++i)
			{
				if (i < 1)
					continue;
				
				sb2.append(sections.get(i));
				sb2.append('.');
			}
			
			if (sb2.length() > 0)
				sb2.append(' ');
			sb2.append(title);
			title = sb2.toString();
		}
		
		newline(2);
		write(title);
		newline(1);
		write(StringUtils.strrep('-', title.length()));
		newline(2);
		
		noWrap = saveNoWrap;
		
		iterate(s.getBody());
		
		while (sections.size() > s.getLevel())
			sections.removeLast();
		sections.add(sections.removeLast() + 1);
	}
	
	public void visit(Paragraph p)
	{
		iterate(p.getContent());
		newline(2);
	}
	
	public void visit(HorizontalRule hr)
	{
		newline(1);
		write(StringUtils.strrep('-', wrapCol));
		newline(2);
	}
	
	
	public void visit(XmlElement e)
	{
		if (e.getName().equalsIgnoreCase("br"))
		{
			newline(1);
		}
		else
		{
			iterate(e.getBody());
		}
	}
	
	/**
	 * Acher M.
	 * tabular convertion / visits
	 */
	
	
	public void visit(Table table) throws IOException
	{
		rewriteNewline();
		
		initNewTableProcessing() ; 
		
		write("<table");
		iterate(table.getXmlAttributes());
		write(">");
		iterate(table.getBody());
		rewriteNewline();
		write("</table>");
		
		endNewTableProcessing() ; 
		
		
		rewriteNewline();

	}
	
	
	
	/*
	 * CSV builders
	 */

	private Collection<CSVWriter> _csvs = new ArrayList<CSVWriter>() ;
	public Collection<CSVWriter> get_csvs() {
		return _csvs;
	}

	public void set_csvs(Collection<CSVWriter> _csvs) {
		this._csvs = _csvs;
	}



	private CSVWriter _csvWriter ;
	private int nCsv = 0 ; 
	
	private void initNewTableProcessing() {
		
		try {
			_csvWriter = new CSVWriter("csv" + nCsv, ",", "", "NameOfTheSection" + nCsv);
			nCsv++ ; 
		} catch (NotValidCSVFileException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		_csvs.add(_csvWriter);		
		
	}
	
	private void endNewTableProcessing() {
		// TODO Auto-generated method stub
		
	}
	
	
	

	private void rewriteNewline() {
		write('\n');		
	}

	public void visit(TableCaption caption) throws IOException
	{
		// TODO: useful comments we can mine and perhpas exploit
		rewriteNewline();
		write("<caption");
		iterate(caption.getXmlAttributes());
		write(">");
		rewriteNewline();
		iterate(caption.getBody());
		write("</caption>");
		rewriteNewline();

	}
	public void visit(TableRow row) throws IOException
	{
		rewriteNewline();
		write("<tr");
		iterate(row.getXmlAttributes());
		write(">");
		rewriteNewline();
		activateRowProcessing();
		iterate(row.getBody());
		rewriteNewline();
		write("</tr>");
		rewriteNewline();

	}
	private void activateRowProcessing() {
		_nProductID++ ; 
		_csvWriter.addRow("productID" + _nProductID);
		
		
	}

	public void visit(TableHeader header) throws IOException
	{
		rewriteNewline();
		
		write("<th");
		iterate(header.getXmlAttributes());
		write(">");
		rewriteNewline();

		activateHeaderProcessing();
		iterate(header.getBody());
		endupHeaderProcessing();
		rewriteNewline();
		write("</th>");
	
		rewriteNewline();

	}
	
	private StringBuilder _headerName ; 
	private boolean _isHeader ;
	private void endupHeaderProcessing() {
		_csvWriter.addLabel(_headerName.toString());
		_isHeader = false ; 
		
		
	}

	private void activateHeaderProcessing() {
		 _headerName = new StringBuilder() ; 
		_isHeader = true ; 
		
	}

	public void visit(TableCell cell) throws IOException
	{
		rewriteNewline();
		write("<td");
		iterate(cell.getXmlAttributes());
		write(">");
		rewriteNewline();
		activateCellProcessing();
		iterate(cell.getBody());
		endupCellProcessing();
		rewriteNewline();
		write("</td>");
		rewriteNewline();

	}
	
	private StringBuilder _cellName ; 
	private boolean _isCell  ;
	private int _nProductID = 0 ; 
	private void endupCellProcessing() {
		_csvWriter.addValueToRow("productID" + _nProductID, _cellName.toString());
		
		_isCell = false ; 
		
		
	}

	private void activateCellProcessing() {
		 _cellName = new StringBuilder() ; 
		_isCell = true ; 
		
	}
	
	


	public void visit(Template tmpl) throws IOException
	{
		write("{");
		write("{");
		iterate(tmpl.getName());
		iterate(tmpl.getArgs());
		write("}}");

	}
	public void visit(TemplateParameter param) throws IOException
	{
		write("{");
		write("{");
		write("{");
		iterate(param.getName());
		dispatch(param.getDefaultValue());
		iterate(param.getGarbage());
		write("}}}");

	}
	public void visit(TemplateArgument arg) throws IOException
	{
		write("|");
		if (!arg.getHasName()) {
			iterate(arg.getValue());
		} else {
			iterate(arg.getName());
			write("=");
			iterate(arg.getValue());
		}

	}
	
	public void visit(XmlAttribute attr) throws IOException
	{
		// nothing

	}
	
	public void visit(XmlAttributeGarbage attr) throws IOException
	{
		// nothing

	}
	
	
	
	
	
	
	// =========================================================================
	// Stuff we want to hide
	
	public void visit(ImageLink n)
	{
	}
	
	public void visit(IllegalCodePoint n)
	{
	}
	
	public void visit(XmlComment n)
	{
	}
	
	public void visit(TagExtension n)
	{
	}
	
	public void visit(MagicWord n)
	{
	}
	
	// =========================================================================
	
	private void newline(int num)
	{
		if (pastBod)
		{
			if (num > needNewlines)
				needNewlines = num;
		}
	}
	
	private void wantSpace()
	{
		if (pastBod)
			needSpace = true;
	}
	
	private void finishLine()
	{
		sb.append(line.toString());
		line.setLength(0);
	}
	
	private void writeNewlines(int num)
	{
		finishLine();
		sb.append(StringUtils.strrep('\n', num));
		needNewlines = 0;
		needSpace = false;
	}
	
	private void writeWord(String s)
	{
		int length = s.length();
		if (length == 0)
			return;
		
		if (!noWrap && needNewlines <= 0)
		{
			if (needSpace)
				length += 1;
			
			if (line.length() + length >= wrapCol && line.length() > 0)
				writeNewlines(1);
		}
		
		if (needSpace && needNewlines <= 0)
			line.append(' ');
		
		if (needNewlines > 0)
			writeNewlines(needNewlines);
		
		needSpace = false;
		pastBod = true;
		line.append(s);
		
		if (_isHeader) 
			_headerName.append(s);
		if (_isCell)
			_cellName.append(s);
		
		
	}
	
	private void write(String s)
	{
		if (s.isEmpty())
			return;
		
		if (Character.isSpaceChar(s.charAt(0)))
			wantSpace();
		
		String[] words = ws.split(s);
		for (int i = 0; i < words.length;)
		{
			writeWord(words[i]);
			if (++i < words.length)
				wantSpace();
		}
		
		if (Character.isSpaceChar(s.charAt(s.length() - 1)))
			wantSpace();
	}
	
	private void write(char[] cs)
	{
		write(String.valueOf(cs));
	}
	
	private void write(char ch)
	{
		writeWord(String.valueOf(ch));
	}
	
	private void write(int num)
	{
		writeWord(String.valueOf(num));
	}
}

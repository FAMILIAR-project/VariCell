package CSVtoFML;

import Exceptions.NotValidCSVFileException;

public class ConversionModelGenerator {

	private Integer _optional;
	private Integer _dead;
	private Integer _dimension;
	private Integer _entities;
	private Integer _unicityCounter;
	private Integer _textual;

	public ConversionModelGenerator(Integer dimension, Integer nbrEntities) {
		_optional = 0;
		_dead = 0;
		_dimension = dimension;
		_entities = nbrEntities;
		_unicityCounter = 0;
		_textual = 0;
	}

	public void setNbrOptional(Integer optional) {
		_optional = optional;
	}

	public void setNbrDead(Integer dead) {
		_dead = dead;
	}

	public void setNbrTextual(Integer textual) {
		_textual = textual;
	}

	private String getUniqueName() {
		_unicityCounter++;
		return "U" + _unicityCounter;
	}

	public ConversionModel generate() throws NotValidCSVFileException {
		if (_dimension * _entities < _optional + _dead + _textual)
			return null;
		ConversionModel out = new ConversionModel("TEST");
		CSVWriter view = new CSVWriter("ID", ",", "N_A", "VIEW");
		out.addView(view);
		int i = 0;
		while (i < _dimension) {
			view.addLabel(getUniqueName());
			i++;
		}
		int j;
		i = 0;
		while (i < _entities) {
			String row = getUniqueName();
			view.addRow(row);
			j = 0;
			while (j < _dimension) {
				if (_optional > 0) {
					view.addValueToRow(row, "Opt");
					_optional--;
				} else if (_dead > 0) {
					view.addValueToRow(row, "No");
					_dead--;
				} else if (_textual > 0) {
					view.addValueToRow(row, getUniqueName());
					_textual--;
				} else
					view.addValueToRow(row, "Yes");
				j++;
			}
			i++;
		}

		return out;
	}
}

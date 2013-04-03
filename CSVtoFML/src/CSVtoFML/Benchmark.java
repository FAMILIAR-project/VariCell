package CSVtoFML;

import java.util.ArrayList;
import java.util.Vector;

import Excel.ToExcel;
import Metric.DoubleMetric;
import Metric.Metric;

/**
 * Simple class used to get execution time between user defined flags.
 * 
 * @author Charles Vanbeneden
 * edited by Taran
 */
public class Benchmark {

	protected ArrayList<String> _flags;
	protected ArrayList<Long> _times;
	
	private ToExcel _toExcel = null;
	private String folder = "";

	/**
	 * Constructor. Creates automatically a flag named "Start".
	 */
	public Benchmark() {
		_flags = new ArrayList<String>();
		_times = new ArrayList<Long>();
		_toExcel = new ToExcel();
		addFlag("Start");
	}

	/**
	 * Constructor. Creates automatically a flag named "Start".
	 */
	public Benchmark(String folder) {
		_flags = new ArrayList<String>();
		_times = new ArrayList<Long>();
		_toExcel = new ToExcel();
		addFlag("Start");
		this.folder = folder;
	}

	/**
	 * Creates a flag named "Stop".
	 * 
	 * @return The time between the start and now.
	 */
	public long stop() {
		addFlag("Stop");
		return timeBetween("Start", "Stop");
	}

	/**
	 * @param first
	 *            First flag.
	 * @param second
	 *            Second flag.
	 * @return The time between the first flag and the second.
	 */
	public long timeBetween(String first, String second) {
		int indexFirst = _flags.indexOf(first);
		int indexSecond = _flags.indexOf(second);
		if (indexFirst == -1 || indexSecond == -1)
			return -1;
		else {
			long time = _times.get(indexFirst) - _times.get(indexSecond);
			if (time < 0)
				time = -time;
			return time;
		}
	}

	/**
	 * @return The time (ms) between the first flag ("Start") and now.
	 */
	public long execTime() {
		return System.currentTimeMillis() - _times.get(0);
	}

	/**
	 * Restart the timer. Add a new Start flag.
	 */
	public void reloadTimer() {
		_flags = new ArrayList<String>();
		_times = new ArrayList<Long>();
		addFlag("Start");
	}

	/**
	 * Add a flag named name.
	 * 
	 * @param name
	 *            Name of the flag to add.
	 */
	public void addFlag(String name) {
		_flags.add(name);
		_times.add(System.currentTimeMillis());
	}

	/**
	 * Show a String representation of the array of flags.
	 */
	public String toString() {
		Vector<Metric> metrics = new Vector<Metric>();
		Vector<Metric> metrics1 = new Vector<Metric>();
		String out = "";
		int size = _flags.size();
		int i = 0;
		String tmp;
		double dbl;
		while (i < size) {
			tmp = _flags.get(i);
			if (i == 0) 
				out = out + tmp + " - " + _times.get(i);
			if (i != 0) {
				dbl = ((double) timeBetween("Start", tmp) / (double) 1000);
				metrics.add(new DoubleMetric(tmp, dbl));
				out = out + tmp + " - " + dbl + "s - ";
				dbl = ((double) timeBetween(_flags.get(i - 1), tmp) / (double) 1000);
				metrics1.add(new DoubleMetric(tmp, dbl));
				out = out + dbl + "s";
			}
			out = out + System.getProperty("line.separator");
			i++;
		}
		
		if(!folder.equals("")) {
			_toExcel.setPath("Ressources/usesCases/" + folder + "/EXCEL/");
			_toExcel.writeMetricsTime(metrics, metrics1);
		}
		
		
		return out;
	}
}

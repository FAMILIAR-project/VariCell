package Metric;

public class DoubleMetric extends Metric {
	private Double meaning;

	public DoubleMetric(String name, Double meaning) {
		super(name, MetricType.Double);
		this.meaning = meaning;
	}

	public void setMeaning(Double meaning) {
		this.meaning = meaning;
	}

	public Double getMeaning() {
		return meaning;
	}
}

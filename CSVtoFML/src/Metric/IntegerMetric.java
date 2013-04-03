package Metric;

public class IntegerMetric extends Metric {
	private Integer meaning;

	public IntegerMetric(String name, Integer meaning) {
		super(name, MetricType.Integer);
		this.meaning = meaning;
	}

	public void setMeaning(Integer meaning) {
		this.meaning = meaning;
	}

	public Integer getMeaning() {
		return meaning;
	}
}

package Metric;

public class TextualMetric extends Metric {
	private String meaning;

	public TextualMetric(String name, String meaning) {
		super(name, MetricType.Textual);
		this.meaning = meaning;
	}

	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}

	public String getMeaning() {
		return meaning;
	}
}

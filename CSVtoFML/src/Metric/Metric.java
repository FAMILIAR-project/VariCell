package Metric;

public abstract class Metric {
	private String name;
	private MetricType type;

	public Metric(String name, MetricType type) {
		this.name = name;
		this.type = type;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public MetricType getType() {
		return type;
	}

	public void setType(MetricType type) {
		this.type = type;
	}
}

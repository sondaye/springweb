package springweb.a02_mvc.a04_vo;

public class JobAvg {
	private String job;
	private double avgsal;
	public JobAvg() {
		super();
		// TODO Auto-generated constructor stub
	}
	public JobAvg(String job, double avgsal) {
		super();
		this.job = job;
		this.avgsal = avgsal;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public double getAvgsal() {
		return avgsal;
	}
	public void setAvgsal(double avgsal) {
		this.avgsal = avgsal;
	}
	

}

package a01_diexp.z05_vo;

public class HandPhone {
	private String hnumber;
	private String company;
	public HandPhone() {
		// TODO Auto-generated constructor stub
	}
	public HandPhone(String hnumber, String company) {
		super();
		this.hnumber = hnumber;
		this.company = company;
	}
	public String getHnumber() {
		return hnumber;
	}
	public void setHnumber(String hnumber) {
		this.hnumber = hnumber;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
}

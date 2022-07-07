package homework_diexp.vo;

public class Park {
	private String parkName;
	private String ticket;
	public Park() {
		// TODO Auto-generated constructor stub
	}
	public Park(String parkName, String ticket) {
		super();
		this.parkName = parkName;
		this.ticket = ticket;
	}
	public String getParkName() {
		return parkName;
	}
	public void setParkName(String parkName) {
		this.parkName = parkName;
	}
	public String getTicket() {
		return ticket;
	}
	public void setTicket(String ticket) {
		this.ticket = ticket;
	}
	

}

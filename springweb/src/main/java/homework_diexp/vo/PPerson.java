package homework_diexp.vo;

public class PPerson {
	private String name;
	private Park park;
	public PPerson() {
		// TODO Auto-generated constructor stub
	}
	public PPerson(String name) {
		super();
		this.name = name;
	}
	public void payTicket() {
		if(park!=null) {
			System.out.println(park.getParkName()+"에 놀러간 "+name+"은 입장료로 "+park.getTicket()+"을 지불했다.");
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Park getPark() {
		return park;
	}
	public void setPark(Park park) {
		this.park = park;
	}
	

}

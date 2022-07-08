package a01_diexp.z05_vo;

public class HPerson {
	private String name;
	private HandPhone handphone;
	public HPerson() {
		// TODO Auto-generated constructor stub
	}
	public HPerson(String name) {
		super();
		this.name = name;
	}
	public void myHandPhone() {
		System.out.println(name);
		if(handphone!=null) {
			System.out.println("## 소유한 핸드폰 ##");
			System.out.println(handphone.getHnumber());
			System.out.println(handphone.getCompany());
		}else {
			System.out.println("핸드폰 없음");
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public HandPhone getHandphone() {
		return handphone;
	}
	public void setHandphone(HandPhone handphone) {
		this.handphone = handphone;
	}
	
	
}

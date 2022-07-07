package a01_diexp.z02_vo;

// 주의) 클래스를 만들고 저장을 해야 실행할 수 있는 컴파일(.class)가 생성되며 
//		외부에서 호출했을 때 오류가 발생하지 않는다. (호출 시 클래스 구성요소에 에러가 생기면 이 부분을 점검하세요)
public class Car {
	private String name;
	private String speed;
	public Car() {
		// TODO Auto-generated constructor stub
	}
	public Car(String name, String speed) {
		super();
		this.name = name;
		this.speed = speed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpeed() {
		return speed;
	}
	public void setSpeed(String speed) {
		this.speed = speed;
	}

	
}

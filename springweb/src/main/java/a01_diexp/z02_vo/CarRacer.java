package a01_diexp.z02_vo;

public class CarRacer {
	private String name;
	private Car car;
	public CarRacer() {
		// TODO Auto-generated constructor stub
	}
	public CarRacer(String name) {
		super();
		this.name = name;
	}
	public void driving() {
		if(car!=null) {
			System.out.println(name+"가 "+car.getName()+"을 "+car.getSpeed()+"로 운행하다.");
		}else {
			System.out.println("자동차 없음");
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
}

package a01_diexp.z05_vo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("carRacer01")
public class CarRacer {
	private String name;
	// Autowired(required = true): default 옵션
	// true 이면, 자동 wiring 처리를 통해 반드시 Car 객체가 있고 이를 처리한다는 의미 -> 객체가 없으면 error 발생함
	// false 이면, Car 객체가 있는 경우 메모리에 할당처리 없으면 없게 처리한다는 의미 -> 객체가 없어도 error 발생하지 않음
	@Autowired(required = false)
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

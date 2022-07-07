package a01_diexp;

import org.springframework.context.support.AbstractApplicationContext;

import org.springframework.context.support.GenericXmlApplicationContext;

import a01_diexp.z05_vo.Car;
import a01_diexp.z05_vo.CarRacer;

public class DIExp23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="a01_diexp\\di23.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(path);
		// DL (dependency lookup) 으로 선언한 id명 객체를 가져온다.
		Car car01 = ctx.getBean("car01",Car.class);
		car01.setName("F1");
		car01.setSpeed("300km/h");

		CarRacer carRacer01 = ctx.getBean("carRacer01",CarRacer.class);
		System.out.println("### 시작 ###");
		System.out.println("### 객체호출 ### "+carRacer01);
		carRacer01.setName("루이스 해밀턴");
		carRacer01.driving();
		ctx.close();

	}

}

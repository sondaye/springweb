package a01_diexp;

import org.springframework.context.support.AbstractApplicationContext;

import org.springframework.context.support.GenericXmlApplicationContext;

import a01_diexp.z01_vo.CarRacer;
//import a01_diexp.z01_vo.HPerson;

public class DIExp17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="a01_diexp\\di17.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(path);
		// DL (dependency lookup) 으로 선언한 id명 객체를 가져온다.
		// hperson
//		HPerson hperson = ctx.getBean("hperson", HPerson.class);
		System.out.println("### 시작 ###");
//		System.out.println("### 객체호출: "+hperson);
//		hperson.myHandPhone();
		CarRacer racer = ctx.getBean("carRacer",CarRacer.class);
		racer.driving();
		ctx.close();

	}
	
}

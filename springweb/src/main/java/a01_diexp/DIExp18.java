package a01_diexp;

import org.springframework.context.support.AbstractApplicationContext;

import org.springframework.context.support.GenericXmlApplicationContext;

import a01_diexp.z01_vo.HPerson;

public class DIExp18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="a01_diexp\\di18.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(path);
		// DL (dependency lookup) 으로 선언한 id명 객체를 가져온다.
		System.out.println("### 시작 ###");
		HPerson hperson = ctx.getBean("hperson",HPerson.class);
		hperson.myHandPhone();
		ctx.close();
	}
	
}

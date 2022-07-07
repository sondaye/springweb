package a01_diexp;

import org.springframework.context.support.AbstractApplicationContext;

import org.springframework.context.support.GenericXmlApplicationContext;

import a01_diexp.z02_vo.Cpu;
import a01_diexp.z02_vo.Person;

public class DIExp20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="a01_diexp\\di20.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(path);
		// DL (dependency lookup) 으로 선언한 id명 객체를 가져온다.
		Person obj = ctx.getBean("person",Person.class);
		Cpu obj2 = ctx.getBean("cpu",Cpu.class);
		System.out.println("### 시작 ###");
		System.out.println("### 객체호출:"+obj);
		System.out.println("### 객체호출:"+obj2);
		
		// ex) a01_diexp.z03_vo 패키지 생성
		// 	   클래스 copy 생성하고, @Component 선언 후, 해당 범위에 객체들이 로딩되게 처리하세요
		ctx.close();
	}
	
}

package a01_diexp;

import org.springframework.context.support.AbstractApplicationContext;

import org.springframework.context.support.GenericXmlApplicationContext;

import a01_diexp.z01_vo.Person;
import a01_diexp.z01_vo.Product;

public class DIExp12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="a01_diexp\\di12.xml"; // xml에 선언한 객체를 연동하기 위해서 path 를 설정해준다
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(path);
		// DL (dependency lookup) 으로 선언한 id명 객체를 가져온다.
		Product prd01 = ctx.getBean("prd01",Product.class);
		System.out.println("### Product 시작 ###");
		System.out.println("### 객체호출: "+prd01);
		System.out.println("### 객체 속성(property)호출: "+prd01.getPname());
		System.out.println("### 객체 속성(property)호출: "+prd01.getPrice());
		System.out.println("### 객체 속성(property)호출: "+prd01.getCnt());
		
		Person p01 = ctx.getBean("p01",Person.class);
		System.out.println("### Person 시작 ###");
		System.out.println("### 객체호출: "+p01);
		System.out.println("### 객체 속성(property)호출: "+p01.getName());
		System.out.println("### 객체 속성(property)호출: "+p01.getAge());
		System.out.println("### 객체 속성(property)호출: "+p01.getLoc());
		
		Person p02 = ctx.getBean("p02",Person.class);
		System.out.println("### Person2 시작 ###");
		System.out.println("### 객체호출: "+p02);
		System.out.println("### 객체 속성(property)호출: "+p02.getName());
		System.out.println("### 객체 속성(property)호출: "+p02.getAge());
		System.out.println("### 객체 속성(property)호출: "+p02.getLoc());
		
		ctx.close();
		
		// DIExp12.java 와 d12.xml 을 생성하고
		// Product vo를 만들어 물건명 가격 갯수를 xml에 property로 지정한 후 DIExp12.java에서 출력하세요
		
		// ex) Music 음악제목 가수 m01(property 로 설정), m02(생성자로 설정) 를 xml 로 객체 생성 및 할당하고 main() 에서 출력하세요

	}

}

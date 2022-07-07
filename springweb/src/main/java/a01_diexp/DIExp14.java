package a01_diexp;

import org.springframework.context.support.AbstractApplicationContext;

import org.springframework.context.support.GenericXmlApplicationContext;

import a01_diexp.z01_vo.Music;
//import a01_diexp.z01_vo.Person;

public class DIExp14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="a01_diexp\\di13.xml"; // xml에 선언한 객체를 연동하기 위해서 path 를 설정해준다
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(path);
		// ex) Music 음악제목 가수 m01(property 로 설정), m02(생성자로 설정) 를 xml 로 객체 생성 및 할당하고 main() 에서 출력하세요
		// DL (dependency lookup) 으로 선언한 id명 객체를 가져온다.
		Music m01 = ctx.getBean("m01",Music.class);
		System.out.println("### Product 시작 ###");
		System.out.println("### 객체호출: "+m01);
		System.out.println("### 객체 속성(property)호출: "+m01.getTitle());
		System.out.println("### 객체 속성(property)호출: "+m01.getArtist());
		
		Music m02 = ctx.getBean("m02",Music.class);
		System.out.println("### Person 시작 ###");
		System.out.println("### 객체호출: "+m02);
		System.out.println("### 객체 속성(property)호출: "+m02.getTitle());
		System.out.println("### 객체 속성(property)호출: "+m02.getArtist());
		
		ctx.close();

	}

}

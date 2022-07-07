package a01_diexp;

import org.springframework.context.support.AbstractApplicationContext;

import org.springframework.context.support.GenericXmlApplicationContext;

import a01_diexp.z01_vo.HPerson;

public class DIExp15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="a01_diexp\\di15.xml"; // xml에 선언한 객체를 연동하기 위해서 path 를 설정해준다
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(path);
		// ex) Music 음악제목 가수 m01(property 로 설정), m02(생성자로 설정) 를 xml 로 객체 생성 및 할당하고 main() 에서 출력하세요
		// DL (dependency lookup) 으로 선언한 id명 객체를 가져온다.
		HPerson obj = ctx.getBean("hperson01",HPerson.class);
		System.out.println("### 시작 ###");
		System.out.println("### 객체호출: "+obj);
		obj.myHandPhone();
		ctx.close();

	}

}

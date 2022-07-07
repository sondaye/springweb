package a01_diexp;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DIExp22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="a01_diexp\\di10.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(path);
		// DL (dependency lookup) 으로 선언한 id명 객체를 가져온다.
		Object obj = ctx.getBean("obj",Object.class);
		System.out.println("### 시작 ###");
		System.out.println("### 객체호출 ### "+obj);
		ctx.close();
		// 호출하면 나오는 탬플릿 소스: java.lang.Object@738dc9b

	}

}

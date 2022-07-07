package a01_diexp;

import org.springframework.context.support.AbstractApplicationContext;

import org.springframework.context.support.GenericXmlApplicationContext;

import a01_diexp.z07_vo.Product;

public class DIExp25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="a01_diexp\\di25.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(path);
		// DL (dependency lookup) 으로 선언한 id명 객체를 가져온다.
		Product product = ctx.getBean("product", Product.class);
		System.out.println("### 시작 ###");
		System.out.println("### 객체호출 ### "+product);
		
		System.out.println("구매물품: "+product.getPname());
		System.out.println("구매가격: "+product.getPrice());
		System.out.println("구매갯수: "+product.getCnt());
		
		ctx.close();
		/*
		 java 폴더 하위 info/data 파일을 만들어
		 물건명 가격 갯수 정보를 할당하고,
		 z07_vo에 Product 클래스를 자동 객체 생성되게 하고
		 Product 클래스에 코드로 설정 정보가 할당되게 하세요.
		 */

	}

}

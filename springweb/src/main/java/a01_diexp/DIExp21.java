package a01_diexp;

import org.springframework.context.support.AbstractApplicationContext;

import org.springframework.context.support.GenericXmlApplicationContext;

import a01_diexp.z03_vo.Product;
import a01_diexp.z03_vo.Mart;

public class DIExp21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="a01_diexp\\di21.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(path);
		// DL (dependency lookup) 으로 선언한 id명 객체를 가져온다.
		System.out.println("### 시작 ###");
		Product product = ctx.getBean("product",Product.class);
		product.setPrdName("사과");
		product.setPrice(3000);
		product.setCnt(2);
		
		Mart mart = ctx.getBean("mart",Mart.class);
		mart.setName("행복마트");
		mart.setPrd01(product); // 설정된 내용을 객체들 간의 자동 autowiring이 안 되어있으므로 직접 코드를 통해 처리해야 한다.
		mart.Cart();
		ctx.close();
	}
	
}

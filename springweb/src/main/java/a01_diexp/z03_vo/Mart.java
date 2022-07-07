package a01_diexp.z03_vo;

import org.springframework.stereotype.Component;

@Component
public class Mart {
	private String name;
	private Product prd;
	public Mart() {
		// TODO Auto-generated constructor stub
	}
	// 생성자를 생성할 때 Product를 포함하지 않고 name으로만 생성해야 한다 (이름만 초기화시키는 생성자)
	public Mart(String name) {
		super();
		this.name = name;
	}
	public void Cart() {
		if(prd!=null) {
			System.out.println("### "+name+" 에서 장바구니에 담은 상품 ###");
			System.out.println(prd.getPrdName()+" "+prd.getPrice()+"원 "+prd.getCnt()+"개를 장바구니에 담았습니다.");
		}
		else {
			System.out.println("장바구니에 상품이 없습니다.");
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Product getPrd() {
		return prd;
	}
	// <bean id="prd02" autowire="byName">
	// 할당할 수 있게 property 선언
	public void setPrd01(Product prd) {
		this.prd = prd;
	}
	

}

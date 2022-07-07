package a01_diexp.z07_vo;
// a01_diexp.z07_vo.Product

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("product")
public class Product {
	@Value("${prd.name}")
	private String pname;
	@Value("${prd.price}")
	private int price;
	@Value("${prd.cnt}")
	private int cnt;
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(String pname, int price, int cnt) {
		super();
		this.pname = pname;
		this.price = price;
		this.cnt = cnt;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

}

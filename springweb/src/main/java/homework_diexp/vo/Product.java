package homework_diexp.vo;

public class Product {
	private String prdName;
	private int price;
	private int cnt;
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(String prdName, int price, int cnt) {
		super();
		this.prdName = prdName;
		this.price = price;
		this.cnt = cnt;
	}
	public String getPrdName() {
		return prdName;
	}
	public void setPrdName(String prdName) {
		this.prdName = prdName;
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

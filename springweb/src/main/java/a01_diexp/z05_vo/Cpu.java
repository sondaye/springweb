package a01_diexp.z05_vo;

// 주의) 클래스를 만들고 저장을 해야 실행할 수 있는 컴파일(.class)가 생성되며 
//		외부에서 호출했을 때 오류가 발생하지 않는다. (호출 시 클래스 구성요소에 에러가 생기면 이 부분을 점검하세요)
public class Cpu {
	private String spec;
	private String company;
	public Cpu() {
		// TODO Auto-generated constructor stub
	}
	public Cpu(String spec, String company) {
		super();
		this.spec = spec;
		this.company = company;
	}
	public String getSpec() {
		return spec;
	}
	public void setSpec(String spec) {
		this.spec = spec;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	

	
}

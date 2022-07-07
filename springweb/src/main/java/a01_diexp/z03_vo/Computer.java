package a01_diexp.z03_vo;

import org.springframework.stereotype.Component;

@Component("com01")
public class Computer {
	private String kind;
	private Cpu cpu;
	public Computer() {
		// TODO Auto-generated constructor stub
	}
	
	public Computer(String kind, Cpu cpu) {
		super();
		this.kind = kind;
		this.cpu = cpu;
	}

	public void checkComInfo() {
		if(cpu!=null) {
			System.out.println("컴퓨터의 종류는 "+kind+", cpu 사양은 "+cpu.getSpec()+", 제조사는 "+cpu.getCompany()+" 입니다.");
		}else {
			System.out.println("cpu 없음");
		}
	}
	
	

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public Cpu getCpu() {
		return cpu;
	}

	public void setCpu(Cpu cpu) {
		this.cpu = cpu;
	}
	
	
	
	
	
	
}

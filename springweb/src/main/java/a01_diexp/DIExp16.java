package a01_diexp;

import org.springframework.context.support.AbstractApplicationContext;

import org.springframework.context.support.GenericXmlApplicationContext;

import a01_diexp.z01_vo.Computer;

public class DIExp16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="a01_diexp\\di16.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(path);
		// DL (dependency lookup) 으로 선언한 id명 객체를 가져온다.
		//CarRacer racer = ctx.getBean("racer01",CarRacer.class);
		Computer computer = ctx.getBean("computer", Computer.class);
		System.out.println("### 시작 ###");
		//System.out.println("### 객체호출: "+racer);
		System.out.println("### 객체호출: "+computer);
		//racer.driving();
		computer.checkComInfo();
		ctx.close();

	}
	
	// ex1) 1:1 관계 설정과 함께 컨테이너에서 호출하여 처리하세요.
	//	    Car: 자동차명, 최고속도
	//	    CarRacer: 운전자명, Car
	//	    driving() ## 가 자동차를 운행하다.
	// ex2) 1:1 관계 설정과 함께 컨테이너에서 호출하여 처리하세요
	//		Cpu: cpu 사양, 제조사
	//      Computer: 종류(데스크탑/조립식/노트북), Cpu
	//		checkComInfo() 
}

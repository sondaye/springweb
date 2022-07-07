package homework_diexp;

import org.springframework.context.support.AbstractApplicationContext;

import org.springframework.context.support.GenericXmlApplicationContext;

import homework_diexp.vo.Mart;
import homework_diexp.vo.PPerson;

public class DIExp0704 {

	public static void main(String[] args) {
	
		String path="homework_diexp\\di0704.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(path);
		/*
		System.out.println("예제 1번 펜과 노트 출력");
		Note note = ctx.getBean("note",Note.class);
		note.write();
		ctx.close();
		*/
		
		/*System.out.println("예제 3번 놀이공원과 사람 출력");
		PPerson pperson = ctx.getBean("PPerson",PPerson.class);
		pperson.payTicket();
		ctx.close();
		*/
		System.out.println("예제 5번 마트 (byName 사용)");
		Mart mart = ctx.getBean("mart",Mart.class);
		mart.Cart();
		ctx.close();
		
		
		
		
	}
	
}

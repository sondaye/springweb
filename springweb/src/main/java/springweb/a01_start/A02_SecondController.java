package springweb.a01_start;
//springweb.a01_start.A02_SecondController

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class A02_SecondController {
	 // http://localhost:7080/springweb/second.do
	   @RequestMapping("/second.do")
	   public String start(){
	   		// 처리할 controller 내용
		   
		   
	   		return "WEB-INF\\views\\a02_secondView.jsp"; // 역슬래시는 2개 써야하고 그냥 슬래시 1개로 써도 됨.
	   		// view 단 호출
	   }

}

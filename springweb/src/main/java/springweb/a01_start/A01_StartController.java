package springweb.a01_start;
//springweb.a01_start.A01_StartController

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import springweb.y01_dao.PrjDao;
import springweb.z01_vo.Emp;
import springweb.z01_vo.Player;
import springweb.z01_vo.Product;

// springweb.y01_dao.PrjDao

@Controller
public class A01_StartController {
	   // http://localhost:7080/springweb/start.do
	   @RequestMapping("/start.do")
	   public String start(){
	   		// 처리할 controller 내용
		   
		   
	   		return "WEB-INF\\views\\a01_startView.jsp"; // 역슬래시는 2개 써야하고 그냥 슬래시 1개로 써도 됨.
	   		// view 단 호출
	   }
	   
	   // ex) A02_SecondController.java
	   //	  WEB-INF\\view\\a02_view.jsp 두번째 스프링 로딩
	   //	  http://localhost:7080/springweb/second.do
	   
	   // 요청값 처리
	   // http://localhost:7080/springweb/call01.do?name=홍길동&age=20
	   @RequestMapping("call01.do")
	   public String call01(@RequestParam("name") String name,
			   				@RequestParam("age") int age) {
		   
		   System.out.println("이름: "+name);
		   System.out.println("나이: "+age);
		   return "";
	   }
	   
	   
	   // ex) http://localhost:7080/springweb/call02.do?pname=사과&price=2000&cnt=2
	   //	  console 에 물건명 가격 갯수로 출력되게 하세요
	   //	  http://localhost:7080/springweb/call02.do
	   //	  defaultValue를 설정해주면 값이 입력되지 않은 페이지도 열린다
	   @RequestMapping("call02.do")
	   public String call02(@RequestParam(value="pname", defaultValue="") String pname,
			   				@RequestParam(value="price", defaultValue="0") int price, 
			   				@RequestParam(value="cnt", defaultValue="0") int cnt,
			   				Model d) {
		   System.out.println("물건명: "+pname);
		   System.out.println("가격: "+price);
		   System.out.println("갯수: "+cnt);
		   // 아래 addAttribute 라인이 모델 설정하는 라인임.
		   d.addAttribute("buyInfo", new Product(pname, price, cnt));
		   // view 에서 모델 데이터 사용하는 법: ${buyInfo.pname} ${buyInfo.price} ${buyInfo.cnt}
		   
		   return "WEB-INF\\views\\a01_basic\\a01_product.jsp";
	   }
	   
	   // ex) 
	   // http://localhost:7080/springweb/call03.do
	   // 인풋: 좋아하는 운동선수[  ], 성적: [  ] [ 데이터 입력 ]
	   // 입력 버튼 클릭시 하단에 입력된 정보 출력
	  @RequestMapping("call03.do")
	  public String call03(@RequestParam(value="name", defaultValue="") String name,
			  			   @RequestParam(value="score", defaultValue="0") int score,
			  			   Model d) {
		  d.addAttribute("playerInfo", new Player(name, score));
		  //			  Player playerInfo = new Player(name, score) 랑 같은 의미
		  
		  d.addAttribute("playerInfo", "이름은 " +name+"성적은 "+score); // 바로 출력
		  // ${buyInfo.pname} 호출은
		  //   buyInfo.getPname() 이랑 같은 의미
		  
		  return "WEB-INF\\views\\a01_basic\\a02_player.jsp";
	  }
	  
	  
	  // 객체로 요청값 처리: bean 개념으로 생각하면 됨
	  // http://localhost:7080/springweb/empList.do
	  // http://localhost:7080/springweb/empList.do?ename=홍길동&job=사원
	  @RequestMapping("/empList.do")
	  public String empList(Emp sch, Model d) {
		  System.out.println("사원명: "+sch.getEname());
		  System.out.println("직책명: "+sch.getJob());
		  
		  // model 데이터 설정
		  d.addAttribute("emplist", new PrjDao().getEmpList2(sch));
		  return "WEB-INF\\views\\a01_basic\\a06_empList.jsp";
	  }
}

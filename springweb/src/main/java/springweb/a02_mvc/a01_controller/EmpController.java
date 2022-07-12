package springweb.a02_mvc.a01_controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import springweb.a02_mvc.EmpService;
import springweb.a02_mvc.a04_vo.Emp;
import springweb.a02_mvc.a04_vo.JobAvg;
import springweb.a02_mvc.a04_vo.MaxSal;

@Controller
public class EmpController {
	@Autowired(required=false)
	private EmpService service;
	// http://localhost:7080/springweb/empList01.do
//	@RequestMapping("empList01.do")
//	public String empList(Emp sch, Model d) {
//		d.addAttribute("empList", service.getEmpList(sch));
//		return "WEB-INF\\views\\a02_mvc\\a01_empList.jsp";
//	}
	
//	@RequestMapping("schJob.do")
//	public String jobSearch(@RequestParam(value="job", defaultValue="") String job, Model d){
//		
//		System.out.println("요청값:"+job);
//		d.addAttribute("jobList", service.getManager(job));
//		return "WEB-INF\\views\\a02_mvc\\a02_jobSearch.jsp";
//	}
	// http://localhost:7080/springweb/schJob.do
	// 화면
	// 직책명 검색:[   ][검색]
	// 사원명 직책명 급여 (출력)
	// WEB-INF\views\a02_mvc\a02_jobSearch.jsp
	
	// 1. 서비스단에 검색하는 기능 메서드 선언, dao 호출
	// 2. controller 메서드 선언, 요청값 처리, 모델 데이터 처리
	//    모델 데이터로 내용 호출 가능하게
	
	
	// # 순서
//	1. 초기화면 호출: http://localhost:7080/springweb/schJob.do
//	2. service단 처리 (EmpService.java): dao 호출하여 return
//		public List<Emp> getManager(String job){
//			return dao2.getManager(job);
//		}
//	3. controller 모델 설정 (EmpController.java)
//		d.addAttrivute("jobList", service.getManager(job));
//	4. view (a02_jobSearch.jsp)
//		1) 요청값 name=job
//		2) <c:forEach var="emp" items="${jobList}">
//	   	   	<td>${emp.ename}</td><td>${emp.job}</td><td>${emp.sal}</td>
//		   </c:forEach>
	
	// hw 0712 과제 3번
	// http://localhost:7080/springweb/JobAvg.do
	@RequestMapping("JobAvg.do")
	public String getJobAvg(String job, Model d){
		System.out.println("요청값:"+job);
		d.addAttribute("avgList", service.getJobAvg(job));
		return "WEB-INF\\views\\a02_mvc\\a03_jobAvgSearch.jsp";
	}
	// http://localhost:7080/springweb/empDetail.do
	@RequestMapping("empDetail.do")
	public String getDetail(@RequestParam(value="empno", defaultValue="0") int empno, Model d){
		System.out.println("요청값:"+empno);
		d.addAttribute("detailList", service.getDetail(empno));
		return "WEB-INF\\views\\a02_mvc\\a04_empnoSearch.jsp";
	}
	// http://localhost:7080/springweb/deptMSal.do
	@RequestMapping("deptMSal.do")
	public String getDeptMaxSal(@RequestParam(value="deptno", defaultValue="0") int deptno, Model d){
		System.out.println("요청값:"+deptno);
		d.addAttribute("deptMsalList", service.getDeptMaxSal(deptno));
		return "WEB-INF\\views\\a02_mvc\\a05_deptMaxSalSearch.jsp";
	}
}

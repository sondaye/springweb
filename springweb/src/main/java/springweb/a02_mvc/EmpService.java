package springweb.a02_mvc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import springweb.a02_mvc.a03_dao.DaoExp01;
import springweb.a02_mvc.a03_dao.EmpDao;
import springweb.a02_mvc.a04_vo.Dept;
import springweb.a02_mvc.a04_vo.DeptEmp01;
import springweb.a02_mvc.a04_vo.Emp;
import springweb.a02_mvc.a04_vo.JobAvg;
import springweb.a02_mvc.a04_vo.MaxSal;
import springweb.a02_mvc.a04_vo.Salgrade;

@Service
public class EmpService {
	@Autowired(required=false)
	private EmpDao dao;
	@Autowired(required=false)
	private DaoExp01 dao2;
	
//	public List<Emp> getEmpList(Emp sch) {
//		System.out.println("사원번호가 있는지?"+dao2.hasEmp());
		// mybatis 에서
		// dao2 = new DaoExp01Impl() 로 실제 객체를 만든다.
		// (인터페이스는 객체를 생성할 수 없음)
		// 다형성 처리
//		DeptEmp01 de = dao2.getDeptEmp();
//		System.out.println("객체 생성 여부:"+de);
//		System.out.println("사원명:"+de.getEname());
//		System.out.println("부서명:"+de.getDname());
//		Salgrade s = dao2.getSalgrade();
//		System.out.println("예제 grade:"+s.getGrade());
//		System.out.println("예제 losal:"+s.getLosal());
//		System.out.println("예제 hisal:"+s.getHisal());
//		// 다중 리스트형 객체 확인용 출력 ↓
//		System.out.println("# 단일 열 다중 행 데이터 #");
//		System.out.println("사원명 갯수: "+dao2.getEnames().size()); 
//		System.out.println(dao2.getEnames().get(0));
//		System.out.println("사원번호 갯수: "+dao2.getEmpnos().size()); 
//		System.out.println(dao2.getEmpnos().get(1));
//		System.out.println("급여 갯수: "+dao2.getSalaries().size());
//		System.out.println(dao2.getSalaries().get(2));
//		System.out.println("직업 갯수: "+dao2.getJobs().size());
//		System.out.println(dao2.getJobs().get(0));
		
		// hw 0708 과제 풀이
//		System.out.println("0708 과제 4번 데이터 갯수:"+dao2.getEmp14().size());
//		System.out.println("0708 과제 5번");
//		for(JobAvg av:dao2.getJobAvg()) {
//			System.out.println(av.getJob()+"\t"+av.getAvgsal());
//		}
		
		// 단일 매개변수 처리
//		Emp emp = dao2.getDetail(7369);
//		if(emp!=null) {
//			System.out.println("사원명: "+emp.getEname());
//		}
		//System.out.println("사원정보삭제");
		//dao2.deleteEmp("사원");
		
		// 단일 매개변수 처리 예제
		//List<Emp> jobList = dao2.getManager("관리자");
		//System.out.println("관리자 데이터 건수: "+jobList.size());
		// System.out.println("2/4분기 사원 삭제");
		// dao2.deleteEmp24(2);
//		MaxSal ms = dao2.getDeptMaxSal(10);
//		System.out.println(ms.getMaxsal());
		
		// 객체 매개변수 처리
//		List<Emp> empschList = dao2.schEmpList02(new Emp("SMITH","CLERK",800));
//		if(empschList!=null && empschList.size()>0) {
//			System.out.println("사원정보 검색 건수: "+empschList.size());
//		}
//		System.out.println("사원정보 등록");
//		// dao2.insertEmp02(new Emp(9001,"신길동","대리));
//		System.out.println("사원정보 수정");
//		// dao2.updateEmp02(new Emp("홍길동(변경)", 5555,3333,7566));
//		System.out.println("부서정보 등록");
//		// dao2.insertDept01(new Dept(99,"기획","서울홍대"));
		
		// 맵 활용 매개변수 처리
//		Map<String, String> schMap = new HashMap<String, String>();
//		schMap.put("ename", "A");
//		schMap.put("job", "MAN");
//		List<Emp> emplist2 = dao2.getEmpList2(schMap);
//		System.out.println("사원정보 조회(Map 활용): "+emplist2.size());
		
		// 맵 활용 매개변수 처리 예제
//		Map<String, String> schDMap = new HashMap<String, String>();
//		schDMap.put("dname", "A");
//		schDMap.put("loc", "A");
//		List<Dept> deptlist2 = dao2.getDeptList2(schDMap);
//		System.out.println("부서정보 조회(Map 활용): "+deptlist2.size());
	
	public List<Emp> getManager(String job){
		return dao2.getManager(job);
	}
	public List<JobAvg> getJobAvg(String job) {
		return dao2.getJobAvg(job);
	}
	public Emp getDetail(int empno) {
		return dao2.getDetail(empno);
	}
	public MaxSal getDeptMaxSal(int deptno) {
		return dao2.getDeptMaxSal(deptno);
	}
	
		
}
	


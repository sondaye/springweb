package springweb.a02_mvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springweb.a02_mvc.a03_dao.DaoExp01;
import springweb.a02_mvc.a03_dao.EmpDao;
import springweb.a02_mvc.a04_vo.DeptEmp01;
import springweb.a02_mvc.a04_vo.Emp;
import springweb.a02_mvc.a04_vo.Salgrade;

@Service
public class EmpService {
	@Autowired(required=false)
	private EmpDao dao;
	@Autowired(required=false)
	private DaoExp01 dao2;
	
	public List<Emp> getEmpList(Emp sch) {
		System.out.println("사원번호가 있는지?"+dao2.hasEmp());
		// mybatis 에서
		// dao2 = new DaoExp01Impl() 로 실제 객체를 만든다.
		// (인터페이스는 객체를 생성할 수 없음)
		// 다형성 처리
		DeptEmp01 de = dao2.getDeptEmp();
		System.out.println("객체 생성 여부:"+de);
		System.out.println("사원명:"+de.getEname());
		System.out.println("부서명:"+de.getDname());
		Salgrade s = dao2.getSalgrade();
		System.out.println("예제 grade:"+s.getGrade());
		System.out.println("예제 losal:"+s.getLosal());
		System.out.println("예제 hisal:"+s.getHisal());
		// 다중 리스트형 객체 확인용 출력 ↓
		System.out.println("# 단일 열 다중 행 데이터 #");
		System.out.println("사원명 갯수: "+dao2.getEnames().size()); 
		System.out.println(dao2.getEnames().get(0));
		System.out.println("사원번호 갯수: "+dao2.getEmpnos().size()); 
		System.out.println(dao2.getEmpnos().get(1));
		System.out.println("급여 갯수: "+dao2.getSalaries().size());
		System.out.println(dao2.getSalaries().get(2));
		System.out.println("직업 갯수: "+dao2.getJobs().size());
		System.out.println(dao2.getJobs().get(0));
		return dao.getEmpList(sch);
	}
	

}

package springweb.a02_mvc.a03_dao;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import springweb.a02_mvc.a04_vo.Dept;
import springweb.a02_mvc.a04_vo.DeptEmp01;
import springweb.a02_mvc.a04_vo.Emp;
import springweb.a02_mvc.a04_vo.EmpQ;
import springweb.a02_mvc.a04_vo.JobAvg;
import springweb.a02_mvc.a04_vo.MaxSal;
import springweb.a02_mvc.a04_vo.Salgrade;
// springweb.a02_mvc.a03_dao.DaoExp01

@Repository
public interface DaoExp01 {
	
	public int getEmpCount();

	public double getSal();
	public double getSalSum();
	public String getJob();
	public boolean hasEmp(); 
	public DeptEmp01 getDeptEmp();
	public Salgrade getSalgrade();
	
	public List<String> getEnames();
	public List<Integer> getEmpnos();
	public List<Double> getSalaries();
	public List<String> getJobs();
	
	// homework 0708 1/4 분기
	public List<EmpQ> getEmp14();
	// homework 0708 평균 급여
	public List<JobAvg> getJobAvg();
	
	// 단일 매개변수 처리
	public Emp getDetail(int empno);
	public void deleteEmp(String job);
	
	// 단일 매개변수 처리 예제
	public List<Emp> getManager(String job);
	public void deleteEmp24(int hiredate_q);
	public MaxSal getDeptMaxSal(int deptno);
	
	// 객체 매개변수 처리
	public List<Emp> schEmpList02(Emp sch);
	public void insertEmp02(Emp ins);
	public void updateEmp02(Emp upt);
	
	// 객체 매개변수 처리 예제
	public void insertDept01(Dept ins);
	
	// 맵 활용 매개변수 처리
	public List<Emp> getEmpList2(Map<String, String> map);	
	
	// 맵 활용 매개변수 처리 예제
	public List<Dept> getDeptList2(Map<String, String> map);
	

}

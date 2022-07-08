package springweb.a02_mvc.a03_dao;
import java.util.List;

import org.springframework.stereotype.Repository;

import springweb.a02_mvc.a04_vo.DeptEmp01;
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

}

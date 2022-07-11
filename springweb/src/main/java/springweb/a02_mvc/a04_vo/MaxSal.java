package springweb.a02_mvc.a04_vo;

public class MaxSal {
	private int deptno;
	private double maxsal;
	public MaxSal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MaxSal(int deptno, double maxsal) {
		super();
		this.deptno = deptno;
		this.maxsal = maxsal;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public double getMaxsal() {
		return maxsal;
	}
	public void setMaxsal(double maxsal) {
		this.maxsal = maxsal;
	}
	

}

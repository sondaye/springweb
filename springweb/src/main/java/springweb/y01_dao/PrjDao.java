package springweb.y01_dao;
import java.sql.*;
import java.util.*;
import springweb.z01_vo.*;


public class PrjDao {
	private Connection con; // 연결객체
	private PreparedStatement pstmt; // 대화객체
	private ResultSet rs;   // 결과객체 (data를 받는 객체)
	public void setConn() throws SQLException { // 예외를 외부에서 한번에 처리할 수 있게 함
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String info = "jdbc:oracle:thin:@localhost:1521:xe";
			con = DriverManager.getConnection(info,"scott","tiger");
			System.out.println("접속 성공");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("클래스 에러: "+e.getMessage());
		} 
	}
	public ArrayList<Emp> getEmpList(String ename, String job) {
		ArrayList<Emp> empList = new ArrayList<Emp>();
		try {
			setConn();
			String sql = "SELECT *\r\n"
					+ "from emp01\r\n"
					+ "WHERE ename LIKE '%'|| ? ||'%'"
					+ "and job like '%'||?||'%'";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, ename);
			pstmt.setString(2, job);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				empList.add(new Emp(
						rs.getInt("empno"),
						rs.getString("ename"),
						rs.getString("job"),
						rs.getInt("mgr"),
						rs.getDate("hiredate"),
						rs.getDouble("sal"),
						rs.getDouble("comm"),
						rs.getInt("deptno"))
						);
			}
			rs.close();
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("DB 에러: "+e.getMessage());
		} catch(Exception e) {
			System.out.println("일반 예외: "+e.getMessage());
		}finally {
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return empList;
	}


	public void insertEmp(Emp ins) {
		try {
			setConn();
			con.setAutoCommit(false);
			String sql = "insert into emp01 values(?,?,?,?,\r\n"
					+ "to_date(?,'YYYY-MM-DD'),?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, ins.getEmpno());
			pstmt.setString(2, ins.getEname());
			pstmt.setString(3, ins.getJob());
			pstmt.setInt(4, ins.getMgr());
			pstmt.setString(5, ins.getHiredate_s());
			pstmt.setDouble(6, ins.getSal());
			pstmt.setDouble(7, ins.getComm());
			pstmt.setInt(8, ins.getDeptno());
			pstmt.executeUpdate();
			con.commit();
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("DB 에러: "+e.getMessage());
			// commit 전에 예외가 발생하면 rollback 처리
			try {
				con.rollback();
			}catch(Exception e1) {
				e1.printStackTrace();
			}
			System.out.println("일반 예외: "+e.getMessage());
		}finally {
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public void updateEmp(Emp ins) {
		try {
			setConn();
			con.setAutoCommit(false);
			String sql = "UPDATE emp01\r\n"
					+ "	SET ename=?,\r\n"
					+ "	job = ?,\r\n"
					+ "	mgr = ?,\r\n"
					+ "	hiredate = to_date(?,'YYYY-MM-DD'),\r\n"
					+ "	sal = ?,\r\n"
					+ "	comm = ?,\r\n"
					+ "	deptno = ?\r\n"
					+ "WHERE empno = ?;";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, ins.getEname());
			pstmt.setString(2, ins.getJob());
			pstmt.setInt(3, ins.getMgr());
			pstmt.setString(4, ins.getHiredate_s());
			pstmt.setDouble(5, ins.getSal());
			pstmt.setDouble(6, ins.getComm());
			pstmt.setInt(7, ins.getDeptno());
			pstmt.setInt(8, ins.getEmpno());
			pstmt.executeUpdate();
			con.commit();
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("DB 에러: "+e.getMessage());
			// commit 전에 예외가 발생하면 rollback 처리
			try {
				con.rollback();
			}catch(Exception e1) {
				e1.printStackTrace();
			}
			System.out.println("일반 예외: "+e.getMessage());
		}finally {
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public void deleteEmp(int empno) {
		try {
			setConn();
			con.setAutoCommit(false);
			String sql = "delte from emp01 where empno=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, empno);
			pstmt.executeUpdate();
			con.commit();
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("DB 에러: "+e.getMessage());
			// commit 전에 예외가 발생하면 rollback 처리
			try {
				con.rollback();
			}catch(Exception e1) {
				e1.printStackTrace();
			}
		}catch(Exception e) {
			System.out.println("일반 예외: "+e.getMessage());
		}finally {
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	public ArrayList<Emp> getEmpListMap(Map<String, String> map) {
		ArrayList<Emp> empList = new ArrayList<Emp>();
		try {
			setConn();
			String sql = "SELECT *\r\n"
					+ "from emp01\r\n"
					+ "WHERE ename LIKE '%'||?||'%'\r\n"
					+ "AND job LIKE '%'||?||'%'";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, map.get("ename"));
			pstmt.setString(2, map.get("job"));
			rs = pstmt.executeQuery();
			while(rs.next()) {
				empList.add(new Emp(
						rs.getInt("empno"),
						rs.getString("ename"),
						rs.getString("job"),
						rs.getInt("mgr"),
						rs.getDate("hiredate"),
						rs.getDouble("sal"),
						rs.getDouble("comm"),
						rs.getInt("deptno"))
						);
			}
			rs.close();
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("DB 에러: "+e.getMessage());
		} catch(Exception e) {
			System.out.println("일반 예외: "+e.getMessage());
		}finally {
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return empList;
	}
	public Emp getEmpDetail(int empno) {
		Emp emp = null;
		try {
			setConn();
			String sql = "select *\r\n"
					+ "from emp01\r\n"
					+ "where empno = ? ";
			System.out.println(sql);
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, empno);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				emp = new Emp(
						rs.getInt("empno"),
						rs.getString("ename"),
						rs.getString("job"),
						rs.getInt("mgr"),
						rs.getDate("hiredate"),
						rs.getDouble("sal"),
						rs.getDouble("comm"),
						rs.getInt("deptno"));
			}
			rs.close();
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("DB 에러: "+e.getMessage());
		} catch(Exception e) {
			System.out.println("일반 예외: "+e.getMessage());
		}finally {
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return emp;
	}
	public static void main(String[] args) {
		PrjDao dao = new PrjDao();
//		dao.insertEmp(new Emp(1005,"이영철","과장",7780,"2022-06-01", 
//				3500,100,10));
//		dao.updateEmp(new Emp(1005,"오영철","과장",7780,"2022-06-01", 
//				3500,100,10));
//		dao.deleteEmp(1005);
//		dao.showEmp();
		//dao.showEmp();
		
		
		// # Map을 사용하여 검색하기
		Map<String, String> sch = new HashMap<String, String>();
		sch.put("ename", "A");
		sch.put("job", "");
		ArrayList<Emp> empList = dao.getEmpListMap(sch);
			for(Emp e:empList) {
				System.out.print(e.getEmpno()+"\t");
				System.out.print(e.getEname()+"\t");
				System.out.print(e.getJob()+"\t");
				System.out.print(e.getMgr()+"\t");
				System.out.print(e.getHiredate()+"\t");
				System.out.print(e.getSal()+"\t");
				System.out.print(e.getComm()+"\t");
				System.out.print(e.getDeptno()+"\n");
			}
	}
	public ArrayList<Emp> getEmpListMap(Emp sch) {
		// TODO Auto-generated method stub
		return null;
	}
	public ArrayList<Emp> getEmpList2(Emp ins) {
		ArrayList<Emp> empList = new ArrayList<Emp>();
		try {
			setConn();
			String sql = "SELECT * from emp01 where ename LIKE '%'||?||'%'"
					+ "and job like '%'||?||'%'";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, ins.getEname());
			pstmt.setString(2, ins.getJob());
			rs = pstmt.executeQuery();
			while(rs.next()) {
				empList.add(new Emp(
						rs.getInt("empno"),
						rs.getString("ename"),
						rs.getString("job"),
						rs.getInt("mgr"),
						rs.getDate("hiredate"),
						rs.getDouble("sal"),
						rs.getDouble("comm"),
						rs.getInt("deptno"))
						);
			}
			rs.close();
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("DB 에러: "+e.getMessage());
		} catch(Exception e) {
			System.out.println("일반 예외: "+e.getMessage());
		}finally {
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return empList;
	}

}

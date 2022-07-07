package springweb.z01_vo;

public class Member {
	String id;
	String pass;
	String name;
	int point;
	String auth;
	public Member() {}

	public Member(String id, String pass, String name, int point, String auth){
		this.id= id;
		this.pass = pass;
		this.name = name;
		this.point = point;
		this.auth = auth;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public String getAuth() {
		return auth;
	}

	public void setAuth(String auth) {
		this.auth = auth;
	}
	
}


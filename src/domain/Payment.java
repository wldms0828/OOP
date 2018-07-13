package domain;

public class Payment {
	public static final String DEPT = "인턴십";
	protected String dept,name;
	int sal;
	public Payment(String name, String sal) {
		this.name = name;
		this.sal = Integer.parseInt(sal);
		setDept(DEPT);
	}
	public void setDept(String dept) {
		this.dept = dept ;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String dept() {
		return dept;
	}
	public String name() {
		return name;
	}
	public int sal() {
		return sal;
	}
	public String toString() {
		return String.format("%s  %s  %d 지급", name , DEPT, sal );
	}

	
}

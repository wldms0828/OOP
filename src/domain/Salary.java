package domain;

public class Salary {
	String dept,name;
	int sal,bonus,total;
	public void setDept(String dept) {
		this.dept =dept;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public void setTotal() {
		total = sal+bonus;
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
	public int bonus() {
		return bonus;
	}
	public String toString() {
		return String.format("%s | %s | %d | %d | %d ", dept,name,sal,bonus,total);
	}
	
}

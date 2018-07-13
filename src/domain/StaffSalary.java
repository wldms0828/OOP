package domain;

public class StaffSalary extends Payment {
	
	public static final String DEPT = "정직원";
	protected int bonus; /**10%*/
	public StaffSalary(String name, String sal) {
		super(name,sal);
		setDept(DEPT);
	}
	public void setBonus() {
		this.bonus=sal+(sal*10)/100;
		
	}
	public int getBonus() {
		return bonus;
	}
	
	

}
	


package domain;

public class OwnerSalary extends StaffSalary{
	public static final String DEPT = "이사회";
	protected int share;//(sal+bonus)*10
	public OwnerSalary(String name, String sal) {
		super(name, sal);
		setDept(DEPT);
	}
	public void setShare() {
		this.share = (sal+bonus)*10;
	}
	public int getShare() {
		return share;
	}
	
}

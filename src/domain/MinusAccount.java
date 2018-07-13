package domain;

public class MinusAccount extends Account {
	public final static String ACCOUNT_TYPE="마이너스통장";
	public final static String BANK_NAME="비트뱅크";
	public int  limit;// 대출금, 대출한도

	public MinusAccount(String name, String uid,String password) {
		super(name,uid,password);
		setAccountType();
		setAccountNo();
		setCreateDate();
	}
	public void setLimit(int limit) {
		this.limit= limit;
	}
	public int getLimit() {
		return limit;
	}
	public String toString() {
		return String.format(" %s\n %s\n 계좌번호 : %s\n 이름 : %s\n 생성일 : %s\n 대출한도 : %d\n 대출금액 : %d",
				BANK_NAME,ACCOUNT_TYPE,super.getAccountNo(),super.getName(),super.getCreateDate(),limit,super.getMoney());
	}
}

package domain;
import java.util.Calendar;
public class Account {
	public final static String BANK_NAME="비트뱅크";
	public final static String ACCOUNT_TYPE="기본통장";
	public final static String WITHDRAW_SUCCESS="출금성공";
	public final static String WITHDRAW_FAIL="잔액부족";
	public final static String DEPOSIT_SUCCESS="입금성공";
	public final static String DEPOSIT_FAIL="적합한 입력값이 아님";
	protected int money;
	protected String name,uid,password,accountType,
					 createDate,accountNo;
	public String toString() {
		return String.format(
				" %s\n %s\n 계좌번호 : %s\n 이름 : %s\n 생성일 : %s\n 잔액 : %d\n",
				BANK_NAME,ACCOUNT_TYPE,accountNo,name,createDate,money);
	}
	// 통장 123-345-678 의 형태가 되도록 코딩
	//createDate 오늘 날짜 뽑는 로직 가져다 쓰세요.
	//money 잔액,uid 인터넷뱅킹 용 아이디,accountType
	public void setMoney(int money) {
		this.money=money;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setUid(String uid) {
		this.uid=uid;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	public void setAccountType() {
		this.accountType=ACCOUNT_TYPE;
	}
	public void setCreateDate() {
		Calendar today = Calendar.getInstance();
		createDate = String.valueOf(today.get(Calendar.YEAR)) + "년" + String.valueOf(today.get(Calendar.MONTH)+1) + "월" + 
					String.valueOf(today.get(Calendar.DATE)) + "일" ;
		
				}
	public void setAccountNo() {
		accountNo = "";
		for(int i = 0;i<2;i++) {
			accountNo += String.valueOf(((int)(Math.random()*900)+100)) + "-"  ;
			if(i==1) {
				accountNo += String.valueOf(((int)(Math.random()*900)+100));
			}
		}
	}
	public int getMoney(int money) {
		return money;
	}
	public String getName() {
		return name;
	}
	public String getUid(String uid) {
		return uid;
	}
	public String getPassword(String password) {
		return password;
	}
	public String getAccountType() {
		return accountType;
	}
	public String getCreateDate() {
		return createDate;
	}
	public String getAccountNo() {
		return accountNo;
	}
	
	
}

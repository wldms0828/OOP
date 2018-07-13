package domain;
import java.util.Date;
import java.text.SimpleDateFormat;
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

	// 통장 123-345-678 의 형태가 되도록 코딩
	//createDate 오늘 날짜 뽑는 로직 가져다 쓰세요.
	//money 잔액,uid 인터넷뱅킹 용 아이디,accountType
	public Account(String name, String uid,String password) {
		setAccountType();
		setAccountNo();
		setCreateDate();
		this.name=name;
		this.uid=uid;
		this.password=password;
	}
	//입금, 출금
	public void setMoney(int money) {
		this.money=money;
	}
	
	public void setPassword(String password) {
		this.password=password;
	}
	public void setAccountType() {
		this.accountType=ACCOUNT_TYPE;
	}
	public void setCreateDate() {
		this.createDate = new SimpleDateFormat("yyyy년  MM월 dd일").format(new Date());
		}

	public void setAccountNo() {
		accountNo = "";
		for(int i = 0;i<2;i++) {
			accountNo += String.format("%03d", (int)(Math.random()*999)) + "-"  ;
			if(i==1) {
			accountNo += String.format("%03d", (int)(Math.random()*999));
			}
		}
	}
	public int getMoney() {
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
	public String toString() {
		return String.format(
				" %s\n %s\n 계좌번호 : %s\n 이름 : %s\n 생성일 : %s\n 잔액 : %d\n",
				BANK_NAME,ACCOUNT_TYPE,accountNo,name,createDate,money);
	}
	
}

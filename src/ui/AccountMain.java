package ui;
/**
 * 비트뱅크
 * 기본통장
 * 계좌번호: 123-456-789
 * 이름 : 홍길동
 * 생성일 : 2018년 6월 10일
 * 잔액 : 10000원
 * --------------
 * 상속이용해서 
 * 비트뱅크
 * 마이너스통장
 * 계좌번호: 123-456-789
 * 이름 : 홍길동
 * 생성일 : 2018년 6월 10일
 * 잔액 : -10000원
 * */
import javax.swing.JOptionPane;
import domain.Account;
import domain.MinusAccount;
enum Abutton {
	EXIT,
	GENERAL_ACCOUNT,
	MINUS_ACCOUNT
};
public class AccountMain {
	public static void main(String[] args) {
		Account ac = null;
		MinusAccount ma = null;
		Abutton[] buttons = { 
			Abutton.EXIT, 
			Abutton.GENERAL_ACCOUNT,
			Abutton.MINUS_ACCOUNT
			}
	;
	while(true) {
		Abutton select = (Abutton) JOptionPane.showInputDialog(null, // frame
				"통장을 선택하세요.", // frame title
				"방법을 선택하세요.", // order
				JOptionPane.QUESTION_MESSAGE, // type
				null, // icon
				buttons, // Array of choices
				buttons[1] // default
						);
		switch(select) {
			case EXIT : return;
			case GENERAL_ACCOUNT :
				ac = new Account();
				ac.setName(JOptionPane.showInputDialog("이름을 입력하세요."));
				ac.setUid(JOptionPane.showInputDialog("사용자의 아이디를 입력하세요."));
				ac.setPassword(JOptionPane.showInputDialog("비밀번호를 입력하시오."));
				ac.setMoney(Integer.parseInt(JOptionPane.showInputDialog("입금금액")));
				ac.setAccountNo();
				ac.setCreateDate();
				JOptionPane.showMessageDialog(null, ac.toString());
				break ; 
			case MINUS_ACCOUNT : 
				ma = new MinusAccount();
				ma.setName(JOptionPane.showInputDialog("이름을 입력하세요."));
				ma.setUid(JOptionPane.showInputDialog("사용자의 아이디를 입력하세요."));
				ma.setPassword(JOptionPane.showInputDialog("비밀번호를 입력하시오."));
				ma.setDebt(Integer.parseInt(JOptionPane.showInputDialog("대출금액")));
				ma.setAccountNo();
				ma.setCreateDate();
				JOptionPane.showMessageDialog(null, ma.toString());
				break ;
		}
		}
	}
}

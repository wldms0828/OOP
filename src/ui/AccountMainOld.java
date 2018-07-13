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
	MINUS_ACCOUNT,
	DEPOSIT,
	WITHDRAW
};
public class AccountMainOld {
	public static void main(String[] args) {
		Account ac = null;
		Abutton[] buttons = { 
			Abutton.EXIT, 
			Abutton.GENERAL_ACCOUNT,
			Abutton.MINUS_ACCOUNT,
			Abutton.DEPOSIT,
			Abutton.WITHDRAW
			}
	;
	while(true) {
		Abutton select = (Abutton) JOptionPane.showInputDialog(null, // frame
				"통장을 선택하세요.", // frame title
				"메뉴를 선택하세요.", // order
				JOptionPane.QUESTION_MESSAGE, // type
				null, // icon
				buttons, // Array of choices
				buttons[1] // default
						);
		switch(select) {
			case EXIT : return;
			case GENERAL_ACCOUNT :
				ac = new Account(
						JOptionPane.showInputDialog("이름을 입력하세요."),
						JOptionPane.showInputDialog("사용자의 아이디를 입력하세요."),
						JOptionPane.showInputDialog("비밀번호를 입력하시오.")
						);
				ac.setMoney(Integer.parseInt(JOptionPane.showInputDialog("입금금액")));
				JOptionPane.showMessageDialog(null, ac.toString());
				break ; 
			case MINUS_ACCOUNT : 
				ac = new MinusAccount(
						JOptionPane.showInputDialog("이름을 입력하세요."),
						JOptionPane.showInputDialog("사용자의 아이디를 입력하세요."),
						JOptionPane.showInputDialog("비밀번호를 입력하시오.")
						);
				ac.setMoney(Integer.parseInt(JOptionPane.showInputDialog("대출한도")));
				ac.setMoney(Integer.parseInt(JOptionPane.showInputDialog("대출금액")));
				JOptionPane.showMessageDialog(null, ac.toString());
			case DEPOSIT : 
				ac.setMoney(Integer.parseInt(JOptionPane.showInputDialog("입금금액")));
				JOptionPane.showMessageDialog(null,ac.getMoney());
				break;
			case WITHDRAW : 
				int money = 0;
				if(((MinusAccount)ac).getLimit()!=0) {
					money = Integer.parseInt(
							JOptionPane.showInputDialog("출금액"));
					if(money > ((MinusAccount)ac).getLimit()) {
						//출금성공
					}else {
						//출금 불가능
					}
					 	
				}else {
					if(money > ac.getMoney()) {
						//출금성공
					}else {
						//출금 불가능
					}
				}
				
				
				ac.setMoney(Integer.parseInt(JOptionPane.showInputDialog("출금금액")));
				JOptionPane.showMessageDialog(null, ac.toString());
				break;
			default : break ;
		}
		}
	}
}

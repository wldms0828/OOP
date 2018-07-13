package ui;
import javax.swing.JOptionPane;
import domain.*;
enum PaymentButt {
	EXIT,INTERNSHIP,STAFF,OWNER
	};
public class SalaryMain {

	public static void main(String[] args) {
		Payment pay = null;
		PaymentButt[] buttons = { 
				PaymentButt.EXIT, 
				PaymentButt.INTERNSHIP,
				PaymentButt.STAFF,
				PaymentButt.OWNER,
				};
	while(true) {
		PaymentButt select = (PaymentButt) JOptionPane.showInputDialog(null, // frame
				"사원 직급별 수당 지급", // frame title
				"직급", // order
				JOptionPane.QUESTION_MESSAGE, // type
				null, // icon
				buttons, // Array of choices
				buttons[1] // default
						);
		switch(select) {
		/*다형성 인스턴스를 하나만 사용해서 재활용 하는 것.
		 * 단, 상속에서만 가능
		 * 김길동, 100 > 김인턴 100만원 지급
		 * 김길동, 100 > 김직원 110만원 지급
		 * 김길동, 100 > 김이사 1100만원 지급
		 * */
		
		
		case EXIT : return;
		case INTERNSHIP : 
			pay = new Payment(
					JOptionPane.showInputDialog("성명"),
					JOptionPane.showInputDialog("기본급"));
			
			JOptionPane.showMessageDialog(null, pay.toString());
			break;
		case STAFF : 
			pay = new StaffSalary(
					JOptionPane.showInputDialog("성명"),
					JOptionPane.showInputDialog("기본급"));
			
			JOptionPane.showMessageDialog(null, ((StaffSalary)pay).getBonus());
			break;
		case OWNER : 
			pay = new OwnerSalary(
					JOptionPane.showInputDialog("성명"),
					JOptionPane.showInputDialog("기본급"));
			
			JOptionPane.showMessageDialog(null, ((OwnerSalary)pay).getShare());
			break;
		}
		
	}
		
	}

}

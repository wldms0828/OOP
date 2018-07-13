package ui;

import javax.swing.JOptionPane;

import domain.*;

import ui.But;
enum But {
	EXIT,TELEPHONE,CELLPHONE,IPHONE,GALAXYPHONE
};
public class PhoneMain {

	public static void main(String[] args) {
		Phone phone = null;
		/*상속 구조에서의 다형성*/
		But[] buttons = { 
				But.EXIT, 
				But.TELEPHONE,
				But.CELLPHONE,
				But.IPHONE,
				But.GALAXYPHONE
				}
		;
		while (true) {
			But select = (But) JOptionPane.showInputDialog(null, // frame
					"방법을 선택하시오", // frame title
					"기능을 선택하시오", // order
					JOptionPane.QUESTION_MESSAGE, // type
					null, // icon
					buttons, // Array of choices
					buttons[1] // default
							);
			switch(select) {
			case EXIT : return;
			case TELEPHONE : 
				phone = new Phone();
				phone.setName(JOptionPane.showInputDialog("name"));
				phone.setPhoneNum(JOptionPane.showInputDialog("phoneNum"));
				phone.setCall(JOptionPane.showInputDialog("call"));
				
				JOptionPane.showMessageDialog(null, phone.toString());
				break;
			case CELLPHONE : 
				phone = new CellPhone();
				phone.setName(JOptionPane.showInputDialog("name"));
				phone.setPhoneNum(JOptionPane.showInputDialog("phoneNum"));
				phone.setCall(JOptionPane.showInputDialog("call"));
				
				JOptionPane.showMessageDialog(null, phone.toString());
				break;
			case IPHONE : 
				phone = new IPhone();
				phone.setName(JOptionPane.showInputDialog("name"));
				phone.setPhoneNum(JOptionPane.showInputDialog("phoneNum"));
				((IPhone) phone).setData(JOptionPane.showInputDialog("data"));
				
				JOptionPane.showMessageDialog(null, phone.toString());
				break;
			case GALAXYPHONE  :
				phone = new GalaxyPhone();
				phone.setName(JOptionPane.showInputDialog("name"));
				phone.setPhoneNum(JOptionPane.showInputDialog("phoneNum"));
				((IPhone) phone).setData(JOptionPane.showInputDialog("data"));
				((GalaxyPhone) phone).setSize();
				JOptionPane.showMessageDialog(null, phone.toString());
				
			default : break;
			
			}
		}
	}
}

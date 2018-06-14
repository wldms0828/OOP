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
		CellPhone cp =null;
		IPhone ip = null;
		GalaxyPhone gp = null;
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
				cp = new CellPhone();
				cp.setName(JOptionPane.showInputDialog("name"));
				cp.setPhoneNum(JOptionPane.showInputDialog("phoneNum"));
				cp.setCall(JOptionPane.showInputDialog("call"));
				
				JOptionPane.showMessageDialog(null, cp.toString());
				break;
			case IPHONE : 
				ip = new IPhone();
				ip.setName(JOptionPane.showInputDialog("name"));
				ip.setPhoneNum(JOptionPane.showInputDialog("phoneNum"));
				ip.setData(JOptionPane.showInputDialog("data"));
				
				JOptionPane.showMessageDialog(null, ip.toString());
				break;
			case GALAXYPHONE  :
				gp = new GalaxyPhone();
				gp.setName(JOptionPane.showInputDialog("name"));
				gp.setPhoneNum(JOptionPane.showInputDialog("phoneNum"));
				gp.setData(JOptionPane.showInputDialog("data"));
				gp.setSize();
				JOptionPane.showMessageDialog(null, gp.toString());
				
			default : break;
			
			}
		}
	}
}

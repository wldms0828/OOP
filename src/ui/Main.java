package ui;

import javax.swing.JOptionPane;
import domain.BMI;
import domain.Grade;
import domain.Salary;
import domain.Lotto;
/*얼마치를 구입하십니까?
5200
5	7	14	15	25	29	43
3	24	33	37	39	40	41
10	8	6	5	3	1	2
1	6	8	3	28	7	10
6	9	8	25	17	27	34	*/
public class Main {
	public static void main(String[] args) {
		BMI bmi = null;
		BMI[] arr = new BMI[2];
		Grade[] arr2 = new Grade[2];	
		Grade grade = null;
		Salary salary = null;
		Salary[]arr3 = new Salary[5];
		Lotto lotto = null;
		Lotto[] arr4 = new Lotto[6];
		int count =0;
		int gcount = 0;
		int scount = 0;
		int lcount = 0;
		while(true) {
			int menu = Integer.parseInt(JOptionPane.showInputDialog(
					"메뉴를 골라주세요.\n"
					+ "0. EXIT\n"
					+ "1. INPUT_BMI\n"
					+ "2. OUTPUT_BMI\n"
					+ "3. INPUT_Grade\n"
					+ "4. OUTPUT_Grade\n"
					+ "5. INPUT_SALAY\n"
					+ "6. OUTPUT_SALAY\n"
					+ "7. INPUT_Lotto\n"
					+ "8. OUTPUT_Lotto\n"));
			
			switch(menu) {
				case 0 :	return;
				case 1 : 
					bmi = new BMI();
					bmi.setName(JOptionPane.showInputDialog("이름"));
					bmi.setHeight(Double.parseDouble(JOptionPane.showInputDialog("키")));
					bmi.setWeight(Double.parseDouble(JOptionPane.showInputDialog("몸무게")));
					bmi.setResult();
					arr[count]=bmi;
					count++;
					break;
				case 2 : 
					String output = "";
					for(int i=0;i<arr.length;i++) {
						output += arr[i].toString()
								+"\n";
					}
					JOptionPane.showMessageDialog(null, output);
					break;
				case 3 :
					grade = new Grade();
					grade.setName(JOptionPane.showInputDialog("이름"));
					grade.setKor(Integer.parseInt(JOptionPane.showInputDialog("kor")));
					grade.setEng(Integer.parseInt(JOptionPane.showInputDialog("eng")));
					grade.setMath(Integer.parseInt(JOptionPane.showInputDialog("math")));
					grade.setTotal();
					grade.setAvg();
					grade.setGrade();
					arr2[gcount]=grade;
					gcount++;
					break;
				case 4 : 
					String goutput ="";
					for(int i = 0;i<gcount;i++) {
						goutput += arr2[i].toString()
								+"\n";
					}
					JOptionPane.showMessageDialog(null, goutput);
					
					break;
				case 5 : 
					salary = new Salary();
					salary.setDept(JOptionPane.showInputDialog("dept"));
					salary.setName(JOptionPane.showInputDialog("name"));
					salary.setSal(Integer.parseInt(JOptionPane.showInputDialog("sal")));
					salary.setBonus(Integer.parseInt(JOptionPane.showInputDialog("bonus")));
					salary.setTotal();
					arr3[scount]=salary;
					scount++;
					break;
				case 6 : 
					String soutput="";
					for(int i =0;i<scount;i++) {
						soutput += arr3[i].toString()
								+"\n";
					}
					JOptionPane.showMessageDialog(null, soutput);
					break;
				case 7 : 
					lotto = new Lotto();
					lotto.setMoney(Integer.parseInt(JOptionPane.showInputDialog("money")));
					JOptionPane.showMessageDialog(null, lotto.toString());
				
				
				default : return;
			}
		}

	}

}

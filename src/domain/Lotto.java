package domain;
/*로또볼 추첨
1~45 까지 랜덤숫자
볼갯수는 총 6개
출력은[5,23,2,40,19,22]*/
public class Lotto {
	int b1,b2,b3,b4,b5,b6,money;
	String result;
	public void setB1(int b1) {
		result = String.valueOf(Math.random()*10);
		for(int i = 0;i<1;i++) {
			
		}
	}
	public void setB2(int b2) {
	}
	public void setB3(int b3) {
	}
	public void setB4(int b4) {
	}
	public void setB5(int b5) {
	}
	public void setB6(int b6) {
	}
	public void setMoney(int money) {
		this.money=money/1000;
	}
	public int b1() {
		return b1;
	}
	public int b2() {
		return b2;
	}
	public int b3() {
		return b3;
	}
	public int b4() {
		return b4;
	}
	public int b5() {
		return b5;
	}
	public int b6() {
		return b6;
	}
	public String toString() {
		return String.format("%d | %d | %d | %d | %d | %d, b1,b2,b3,b4,b5,b6");
	}
}

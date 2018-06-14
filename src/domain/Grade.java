package domain;

public class Grade {
	int kor,eng,math,total,avg;
	String name,grade;
	public void setKor(int kor){
		this.kor =kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public void setTotal() {
		total = kor+eng+math;
	}
	public void setAvg() {
		avg = total/3;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setGrade() {
		
		if(avg >= 90){
			grade = "A";
		}else if(avg >= 80){
			grade = "B";
		}else if(avg >= 70){
			grade = "C";
		}else if(avg >= 60){
			grade = "D";
		}else if(avg >= 50){
			grade = "E";
		}else {
			grade = "F";
		}
	}

	public String toString() {
		return String.format("%s | %d | %d | %d | %d | %d | %s",name,kor,eng,math,total,avg,grade);
	}

}	

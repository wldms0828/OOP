package domain;

public class GalaxyPhone extends IPhone{
	public static final String BRAND = "삼성", 
			KIND = "갤럭시노트폰";
	private String size,kaTalk;
	
	// 홍길동에게 010번호로 삼성 제품 6인치
	// 갤럭시노트폰을 사용해서 이동가능한 상태로
	//안녕이라고 카톡했다.
	//data를 오버라이딩하세요.
	public void setSize() {
		size = "6인치";
	}
	
	public void setData(String data) {
		super.data = "이라고 카톡했다.";
	}
	public String getSize() {
		return size;
	}
	
	public String toString() {
		setPortable(true);
		return String.format("%s에게 %s 번호로 %s 제품  %s %s를 사용해서 %s 상태로 %s ."
				,super.getName(),super.getPhoneNum(),BRAND,size,KIND, super.getMove(),super.getData());
	}
}

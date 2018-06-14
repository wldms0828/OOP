package domain;

public class IPhone extends CellPhone {
	public static final String BRAND = "애플", 
			KIND = "스마트폰";
	protected String data;
		//홍길동(name)에게 010번호(pN)로 애플제품(brand) 아이폰을 사용해서 스마트폰(kind)이기 
		//때문에 이동가능한 상태로 안녕이라고 문자를 전송했다.
	public void setData(String data) {
		this.data = data+"이라고 문자했다.";
	}
	public String getData() {
		return data;
	}
	
	public String toString() {
		setPortable(true);
		return String.format("%s에게 %s 번호로 %s 제품  %s을 사용해서 %s 상태로 %s"
				,super.getName(),super.getPhoneNum(),BRAND,KIND, super.getMove(),data);
	}
	
	
}

//interface의 첫번째 목표는 다중상속
/*
 * 3.interface는 instance화할 수 없다.
 * 인터페이스란 추상메소드와 스태틱상수로만 구성된 객체 (주소가 없다)
 */

public interface InterfaceDemo {
	public static void main(String[] args) {
//		Datable d = new Datable(); new를 쓸 수 없다.
		Datable d = new Dated(); // 선언형은 인터페이스 실제형은 자식클래스
		d.set(Datable.TUE); // static이기 때문에 주소없이(Datable.TUE) 접근
		System.out.println(d.get());
	}
}

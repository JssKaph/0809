import java.util.Calendar;
import java.util.GregorianCalendar;

//멀쩡한 클래스를 abstract로 가능, 다형성의 강제화

/*
 * Abstract Class
 * -class 선언시 abstract으로 선언된 클래스
 * -instance로 생성 할 수 없다.
 * -1)자식 클래스를 통해 생성하는 방법
 * -2)static 멤버로 생성하는 방법
 * -다형성의 강제화
 */

public class AbstractClassDemo1 {
	private int age;
	public static void main(String[] args) { //static 지역에서는 this와 super 사용불가능(상속과 상관이 없음)
		
		//추상 클래스를 사용 하는 방법
		//1. 자식클래스를 이용하는 방법
		//Calendar cal = new Calender(); new는 사용 불가능
//		Calendar cal = new GregorianCalendar();
//		System.out.println(cal.get(Calendar.YEAR)+cal.get(Calendar.MONTH),cal.get(Calendar.DATE));
		
		//2. getInstance 스태틱을 이용하는 방법
		Calendar cal = Calendar.getInstance();
	}
}

abstract class Human{
	private String tel;
	private String address;
	private static str = "Hello, World";
	public Human (String tel, String address) {
		this.tel = tel;
		this.address = address;
	}

	
	public static Human getInstance() {
		return str;
	}
	
	@Override
	public String toString() {
		return String.format("Human [tel=%s, address=%s]", tel, address);
	}
}
/*
 * 2.이종상속(자식은 class, 부모는 interface)의 경우에는 implements를 사용한다.
 */
public class Dated implements Datable{  // implements 이종상속(상속구현), 클래스 > 메소드
	private int date;
	
	@Override
	public int get() { // 부모의 public(생략됨) 이 상속됨
		// TODO Auto-generated method stub
		return date;
	}

	@Override
	public void set(int date) {
		// TODO Auto-generated method stub
		this.date = date;
	}
}

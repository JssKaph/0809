/* 
 * 5. interface는 다중 상속이 가능하기 때문에 모든 메소드를 재정의 해야한다.
 * 6. interface의 주소는 해당 인터페이스의 재정의된 메소드만 접근 가능하다.
 * 7. interface 배열에는 해당 인터페이스의 자식 클래스를 넣을 수 있다.
 */ 
public class InterfaceDemo1 implements Mother, Father {

	@Override
	public void grandFather() {
		System.out.println("Called bu grandFather()");
	}

	@Override
	public void grandMother() {
		System.out.println("Called bu grandMother()");
	}

	@Override
	public void father() {
		System.out.println("Called bu father()");
	}

	@Override
	public void mother() {
		System.out.println("Called bu mother()");
	}

	public static void main(String[] args) {
//		GrandFather gFather = new InterfaceDemo1(); // 할아버지의 주소로 손자에 접근
//		gFather.grandFather();
//		
//		Father father = new InterfaceDemo1();
//		father.grandFather(); // 할배 할매 본인 접근가능
//		father.grandMother();
//		father.father();
		
		Mother [] array = new Mother[3]; // 마더 배열에는 마더의 자식을 넣을 수 있다.
		array[0] = new InterfaceDemo1();
		array[0].mother(); // mother만 접근 가능 
		
		System.out.println("Father's MAX = " + Father.MAX);
		System.out.println("Father's MAX = " + Mother.MAX);
	}
}

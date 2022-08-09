
public class AbstractClassDemo {
	public static void main(String[] args) {
		Mammal m = new Dog("포유류", 20); // Mammal 이라는 클래스는 추상클래스라서 실제로 존재하지 않기 때문에 new에 의해 생성될 수 없다.
		// 따라서 다형성을 사용해서 new Mammal이 아닌 new Dog 사용 부모의 주소를 호줄해서 자식의 메소드에 접근(다형성)
		System.out.println(m);
	} 
}

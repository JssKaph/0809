
public class Dog extends Mammal {
	
	public Dog(String name, int age) {
		super(name,age); //  부모의 생성자를 중복 정의 
	}

	@Override
	public void saySomething() { // 부모는 선언, 자식은 정의 (의무적인 행동, 강제적 재정의)
		System.out.println("멍멍");
	} 

}

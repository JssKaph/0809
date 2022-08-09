
public class InterfaceDemo6 {
	public static void main(String[] args) {
		Product ballpen = new Product("Ballpen", "모나미", 200);
//		Product another = ballpen; // 주소복사
		
		// 값 복사
		Product another = (Product)(ballpen.copy());
		System.out.println("Before Change");
		System.out.println(ballpen);
		System.out.println(another);
		System.out.println("After Change");
		ballpen.setPrice(50000);
		System.out.println(ballpen);
		System.out.println(another); // Cloneable 아니기 때문에 바뀌지 않음
	}
}

import java.util.Scanner; // 원래는 클래스 까지 import 함
import static java.lang.System.out; // 클래스 아래에 스태틱 까지 내려옴 -> import static
import static java.lang.Math.*; // Math에 있는 모든 스태틱 

public class StaticImportDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int rand = (int) (random() * 6 + 1);
		out.println("rand = " +rand);
		out.println("PI = "+PI);
	}
}
-
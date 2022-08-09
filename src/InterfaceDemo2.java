import java.util.Arrays;

public class InterfaceDemo2 {
	public static void main(String[] args) {
		Student [] array = { new Student("한지민",56), new Student("박지민",100), new Student("홍지민",77)};
		
		Arrays.sort(array); // 어떤 기준으로 할건지 알려줘야됨 Student 12번
		
		System.out.println(Arrays.toString(array)); // 토탈 기준으로 정렬 
	}
}

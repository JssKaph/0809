
public class Student implements Comparable<Student>{ // Comparable<Type> 의 자식 Student, 기능을 덧 붙힘
	private String name;
	private int total;
	
	public Student(String name, int total) { // 생성자
		this.name = name;
		this.total = total;
	}

	@Override
	public int compareTo(Student o) {
//		return this.total - o.total; // 결과가 양수면 오름차순 (토탈 기준)
		return this.name.compareTo(o.name); // 이름기준 정렬
		
	}

	@Override
	public String toString() {
		return String.format("Student [name=%s, total=%s]", name, total);
	}
	
	
}

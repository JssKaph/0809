/*
 * 1.public static final이 생략된 변수와 public abstract이 생략된 메소드만 가진다.
 */
public interface Datable {
	int SUN = 0, MON = 1, TUE = 2, WED = 3,  THU= 4, FRI = 5, SAT = 6;

	int get(); // 메소드, 필수 3요소를 가지고 있다. //public abstract 생략

	void set(int date);
}

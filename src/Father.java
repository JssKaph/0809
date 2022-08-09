/*
 * 4. interface끼리의 상속(동족상속)은 extends를 사용한다. 그리고 다중 상속이 가능하다.
 */

public interface Father extends GrandFather,GrandMother {
	int MAX= 100;
	void father();
}

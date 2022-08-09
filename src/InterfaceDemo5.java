import java.util.Arrays;

public class InterfaceDemo5  {
	public static void main(String[] args) {
		Product [] array = new Product[3];
		array[0] = new Product("Ballpen", "모나미", 200);
		array[1] = new Product("Notebook", "Apple", 2500000);
		array[2] = new Product("Keyboard", "Logitech", 20000);
		Arrays.sort(array); // 반드시 컴페어버블 자식
		System.out.println(Arrays.toString(array));
	}
}

//class Product implements Comparable<Product>{
//	private String name, maker;
//	private int price;
//	
//	@Override
//	public int compareTo(Product obj) {
////		return obj.name.compareTo(this.name); // 내림차순
//		return this.maker.compareTo(obj.maker); // 오름차순
//		// 앞의 객체 - 뒤의 객체 : 오름차순
//		// 뒤의 객체 - 앞의 객체 : 내림차순
//	}
//	
//	public Product(String name, String maker, int price) {
//		this.name = name;
//		this.maker = maker;
//		this.price = price;	
//	}
//
//	@Override 
//	public String toString() {
//		return String.format("Product [name=%s, maker=%s, price=%s]", name, maker, price);
//	}
//
//}
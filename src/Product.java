
class Product implements Comparable<Product>, Cloneable { // Cloneable (복제가능)
	private String name, maker;
	private int price;
	
	public void setPrice(int price) {
		this.price = price;
	}

	Object copy(){
		Object obj = null;
		try {
			obj = this.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("이 객체는 복제를 지원하지 않습니다.");
		}
		return obj;
	}
	
	@Override
	public int compareTo(Product obj) {
//		return obj.name.compareTo(this.name); // 내림차순
		return this.maker.compareTo(obj.maker); // 오름차순
		// 앞의 객체 - 뒤의 객체 : 오름차순
		// 뒤의 객체 - 앞의 객체 : 내림차순
	}

	public Product(String name, String maker, int price) {
		this.name = name;
		this.maker = maker;
		this.price = price;
	}

	@Override 
	public String toString() {
		return String.format("Product [name=%s, maker=%s, price=%s]", name, maker, price);
	}
}

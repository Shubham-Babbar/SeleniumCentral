package Jan_2020;

public class Class3 implements Interface1{

	public void method1() {
		System.out.println("Method 1");
	}
	public void method2() {
		System.out.println("Method 2");
	}
	
	public static void main(String[] args) {
	
		Class3 ob = new Class3();
		ob.method1();
		ob.method2();
	}
}

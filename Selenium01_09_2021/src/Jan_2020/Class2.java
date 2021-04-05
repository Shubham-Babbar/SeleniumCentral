package Jan_2020;

public class Class2 extends Class1{

	public void method2() {
		System.out.println("Method 2 Inside Child");
	}
	
	public static void main(String[] args) {
	
		Class2 ob = new Class2();
		ob.method1();
		ob.method2();
	}
}

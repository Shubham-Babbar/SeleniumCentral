package Jan_2020;

public class file01_16 {
	
	public file01_16() {
		this(1,2,3,4);
		System.out.println("Default Consctructor");
	}
	
	public file01_16(int a) {
		this();
		System.out.println("1 parameter constructor");
	}
	
	public file01_16(int a, int b) {
		this(1,2,3);
		System.out.println("2 parameter constructor");
	}
	
	public file01_16(int a, int b, int c) {
		this(1);
		System.out.println("3 parameter constructor");
	}
	
	public file01_16(int a, int b, int c, int d) {
		System.out.println("4 parameter constructor");
	}
	
	public void method() {
		this.method(1,2,3);
		System.out.println("Default method");
	}
	
	public void method(int a) {
		this.method(1,2);
		System.out.println("1 parameter method");
	}
	
	public void method(int a, int b) {
		this.method(1,2,3,4);
		System.out.println("2 parameter method");
	}
	
	public void method(int a, int b, int c) {
		System.out.println("3 parameter method");
	}
	
	public void method(int a, int b, int c, int d) {
		this.method();
		System.out.println("4 parameter method");
	}
	
	public static void main(String[] args) {
		file01_16 obj = new file01_16(2,3);
		System.out.println("-----------------");
		obj.method(1);
	}
	
}

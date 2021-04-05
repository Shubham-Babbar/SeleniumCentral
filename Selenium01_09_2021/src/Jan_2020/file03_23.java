package Jan_2020;

public class file03_23 {
	
	public file03_23() {
		this(1,2,3,4);
		System.out.println("Default Consctructor");
	}
	
	public file03_23(int a) {
		this();
		System.out.println("1 parameter constructor");
	}
	
	public file03_23(int a, int b) {
		this(1,2,3);
		System.out.println("2 parameter constructor");
	}
	
	public file03_23(int a, int b, int c) {
		this(1);
		System.out.println("3 parameter constructor");
	}
	
	public file03_23(int a, int b, int c, int d) {
		System.out.println("4 parameter constructor");
	}
	
	
}

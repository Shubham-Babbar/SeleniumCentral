package Jan_2020;

public class file03_23child extends file03_23 {
	
	public file03_23child() {
		this(1,2,3,4);
		System.out.println("Child Default Consctructor");
	}
	
	public file03_23child(int a) {
		this();
		System.out.println("Child 1 parameter constructor");
	}
	
	public file03_23child(int a, int b) {
		this(1,2,3);
		System.out.println("Child 2 parameter constructor");
	}
	
	public file03_23child(int a, int b, int c) {
		this(1);
		System.out.println("Child 3 parameter constructor");
	}
	
	public file03_23child(int a, int b, int c, int d) {
		super();
		System.out.println("Child 4 parameter constructor");
	}

	
	public static void main(String[] args) {
		file03_23child obj = new file03_23child(2,3);
	}
	
}

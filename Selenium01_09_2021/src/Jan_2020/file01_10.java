package Jan_2020;

import java.util.Scanner;

public class file01_10 {

	public int sum1(int a, int b) {
		int c=a+b;
		return c;
	}
	
	public int diff1(int a, int b) {
		int c=a-b;
		return c;
	}
	
	public int prod1(int a, int b) {
		int c=a*b;
		return c;
	}
	
	public int div1(int a, int b) {
		int c=a/b;
		return c;
	}
	
	public static void main(String[] args) {
		
		file01_10 obj = new file01_10();
		int res1 = obj.div1(obj.prod1(obj.diff1(obj.sum1(obj.sum1(10,2),2),2),2),2);
		System.out.println("(((((10+2)+2)-2)*2)/2) = "+res1);
		int res2 = obj.div1(obj.sum1(obj.diff1(obj.prod1(obj.diff1(10,2),2),2),2),2);
		System.out.println("(((((10-2)*2)-2)+2)/2) = "+res2);
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of x1 :");
		var x1 = s.nextInt();
		System.out.println("Enter value of x2 :");
		var x2 = s.nextInt();
		System.out.println("Enter value of x3 :");
		var x3 = s.nextInt();
		System.out.println("(((x1*x2)+x3)-x1) = "+obj.diff1(obj.sum1(obj.prod1(x1, x2), x3), x1));
	}

}

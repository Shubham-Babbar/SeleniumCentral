package Jan_2020;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter number:");
		int a = s.nextInt();
		System.out.println("Please enter number:");
		int b = s.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Swapped a: "+a+" and b: "+b);
		
		
	}
}

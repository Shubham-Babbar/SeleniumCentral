package Jan_2020;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter a number : ");
		int a = s.nextInt();
		int flag = 0;
		for(int i=2;i<=a/2;i++)
		{
			if(a%i==0)
			{
				System.out.println("Given number is not prime");
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Given number is prime");
		}
		
		
	}
}

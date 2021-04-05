package Jan_2020;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
	
	//read complete file
	public String readFile(String path) throws IOException {
		File f = new File(path);
		FileReader fr = new FileReader(f);
		BufferedReader br= new BufferedReader(fr);
		
		String data="";
		String s;
		while((s=br.readLine())!=null)
		{
			data=data+s+"\n";
			System.out.println(s);
		}
		return data;
	}
	
	
	//read file with range
	public void readFileWithRange(String path) throws IOException {
		File f = new File(path);
		FileReader fr = new FileReader(f);
		BufferedReader br= new BufferedReader(fr);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter line number range");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int i=1;
		int flag=0;
		String s;
		while((s=br.readLine())!=null)
		{
			if(i>=num1 && i<=num2) {
			System.out.println(s);
			flag=1;
			}
			i++;
		}
		if(flag==0) {
			System.out.println("Enter valid number range between 1 and "+(i-1));
		}
		
	}
	
	
	public static void main(String[] args) throws IOException {
	
		ReadFile r = new ReadFile();
		String ss = r.readFile("../Selenium01_09_2021/ForRead.txt");
		System.out.println("__________________\n"+ss);
				
	}
}

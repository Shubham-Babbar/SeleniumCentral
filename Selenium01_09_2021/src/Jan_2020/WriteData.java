package Jan_2020;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteData extends ReadFile{

	public static void main(String[] args) throws IOException {
		File f = new File("../Selenium01_09_2021/ForWrite.txt");
		FileWriter fw = new FileWriter(f,true);
		BufferedWriter b = new BufferedWriter(fw);
		
		File f1 = new File("../Selenium01_09_2021/ForWrite.txt");
		FileReader fr= new FileReader(f1);
		BufferedReader br = new BufferedReader(fr);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the text");
		String txt = sc.next();
		System.out.println("Please enter the row no");
		int num = sc.nextInt();
		
		int i=1;
		String s;
		while((s=br.readLine())!=null) {
			System.out.println("i = "+i+" and num = "+num);
			if(i == num-1) {
			b.write(txt);
			b.newLine();
			}
			i++;
		}
		
		b.close();

	}
}

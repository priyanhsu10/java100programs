package basics;

import java.util.Scanner;

//Program to Convert Decimal to Binary
public class P017 {

	public static void main(String[] args) {
		
	 System.out.println("enter number , program convert decimal number to binary");
	 
	 StringBuilder sb=new StringBuilder();
	 Scanner sc = new Scanner(System.in);
	 int n= sc.nextInt();
	 
	 while(n>0) {
		 sb.append(n%2);
		 n=n/2;
	 }
	 System.out.println(sb.reverse().toString());
	}
}

package basics;

import java.util.Scanner;

//Program to Swap Two Numbers
public class P006 {
	
	public static void main(String[] args) {
		
		System.out.println("Enter 2 number , program will swap the nubmer ");
		System.out.println("a=");
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		System.out.println("b=");
		int b= sc.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a= "+a);
		System.out.println("b =" +b);
		
	}

}

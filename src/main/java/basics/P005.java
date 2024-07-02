package basics;

import java.util.Scanner;

//Program to Find the Largest of Three Numbers
public class P005 {
	
	public static void main(String[] args) {
		
		System.out.println("enter 3 number , program identify the largest one:");
		
		Scanner sc= new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a>b) {
			if(a>c) {
				System.out.println(a+" is largest");
			}else {
				System.out.println(c +" is largest");
			}
		}else {
			if(b>c) {
				System.out.println(b+" is largest");
			}else {
				System.out.println(c+" is largest");
			}
		}
	}

}

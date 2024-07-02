package basics;

import java.util.Scanner;

//Program to Find the Factorial of a Number
public class P008 {
	public static void main(String[] args) {
		
		System.out.println("enter the number , program deternimed factorial of number");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		long result= 1;
		for (int i=1;i<n;i++) {
			result+=result*i;
			}
		
		System.out.println("factoriial of "+n+ " is "+result);
		
	}

}

package basics;
//Program to Find the Sum of Digits of a Number

import java.util.Scanner;

public class P018 {
	public static void main(String[] args) {
		
		System.out.println("Enter number , program print the sum of the digit");
		Scanner sc= new Scanner(System.in);
		String s = sc.next();
		int result= 0;
		char[] sarray= s.toCharArray();
		for(int i=0;i<sarray.length;i++) {
			int n=Integer.valueOf(String.valueOf(sarray[i]));
			result+=n;
		}
		
		System.out.println("sum of digit is ="+ result);
	}

}

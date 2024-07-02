package basics;

import java.util.Scanner;

//Program to Calculate Power of a Number
public class P020 {
	public static void main(String[] args) {
		System.out.println("Enter the 2 number s, program print the power ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int pow = sc.nextInt();
		int result = n;
		for (int i = 2; i <= pow; i++) {
			result = result * n;
			
		}

		System.out.println(n +" power of " + pow + " is " + result);
	}
}

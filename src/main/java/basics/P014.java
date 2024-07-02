package basics;

import java.util.Scanner;

//Program to Find the LCM of Two Numbers
public class P014 {

	public static void main(String[] args) {
		System.out.println("Enter 2 number program will determine LCM of 2 number;");

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int gcd = 1;
		for (int i = 1; i < a; i++) {
			if (a % i == 0 && b % i == 0) {
				gcd = i;
			}
		}
		int lcm = a * b / gcd;
		System.out.println("lcm of " + a + " and " + b + " is " + lcm);
	}

}

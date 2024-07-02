package basics;

import java.util.Scanner;

//Program to Check if a Number is Prime
public class P012 {

	public static void main(String[] args) {
		System.out.println("Enter number , program determine number is prime or not");

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		boolean result = true;

		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0) {
				result = false;
				break;
			}
		}
		if (result) {
			System.out.println(n + " is prime number ");
		} else {
			System.out.println(n + " is not prime number ");
		}
	}

}

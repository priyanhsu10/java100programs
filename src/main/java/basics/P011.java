package basics;

import java.util.Scanner;

//Program to Check if a Number is Palindrome
public class P011 {

	public static void main(String[] args) {

		System.out.println("Enter nubmer , Program determine number is palidrom or not");

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int backup = number;
		StringBuilder reverse = new StringBuilder();

		while (number > 0) {
			int d = number % 10;
			reverse.append(d);

			number = number / 10;

		}
		int r = Integer.valueOf(reverse.toString());
		if (backup == r) {
			System.out.println(backup + " is palindrome");
		} else {
			System.out.println(backup + " is not palidrome");
		}
	}
}

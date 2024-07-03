package basics;

import java.util.Scanner;

//Program to Check if a Number is Armstrong
public class P019 {
	public static void main(String[] args) {
		System.out.println("Enter number , program determine the number is armstrong or not");

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int backup = n;

		int result = 0;
		while (n > 0) {

			int d = n % 10;
			n = n / 10;
			result += Math.pow(d, 3);

		}
		if (backup == result) {
			System.out.println(backup + " is Armstrong number");
		} else {
			System.out.println(backup + " is not Armstrong number");
		}
		sc.close();
	}
}

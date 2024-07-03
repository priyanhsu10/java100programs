package basics;

import java.util.Scanner;

//Program to Perform Basic Arithmetic Operations

public class P023 {
	public static void main(String[] args) {

		boolean r = true;
		Scanner sc = new Scanner(System.in);

		while (r) {
			printOptions();
			int op = sc.nextInt();

			System.out.println("enter 2 numbers");
			int a = sc.nextInt();
			int b = sc.nextInt();
	
			switch (op) {
			case 1:
				System.out.println("addtion of " + a + " and " + b + "=" + (a + b));
				break;
			case 2:
				System.out.println("subscrt of " + a + " and " + b + "=" + (a - b));
				break;
			case 3:
				System.out.println("addtion of " + a + " and " + b + "=" + (a * b));
				break;
			case 4:
				if(b==0) {
					System.out.println("cannot divide by zero");
					break;
				}
				System.out.println("addtion of " + a + " and " + b + "=" + (a / b));
			default:
				System.out.println("please select correct option");

			}

			System.out.println("do you want continuew y/n");
			String s = sc.next();
			if (!s.equalsIgnoreCase("y")) {
				r = false;

			}
			
		}
		sc.close();
	}

	private static void printOptions() {
		System.out.println("Select of operations");
		System.out.println("1 for addintion");
		System.out.println("2 for substraction");
		System.out.println("3 for multiplication");
		System.out.println("4 for devision");
	}

}

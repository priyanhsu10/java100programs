package basics;

import java.util.Scanner;

//Program to Add Two Matrices
public class P038 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter 1st metrix element for 3*3");

		int[][] a = new int[3][3];
		int[][] b = new int[3][3];
		int[][] c = new int[3][3];

		for (int i = 0; i < a[0].length; i++) {
			System.out.println("enter electment for row " + i + 1);
			for (int j = 0; j < a.length; j++) {
				a[i][j] = sc.nextInt();
			}

		}

		for (int i = 0; i < b[0].length; i++) {
			System.out.println("enter electment for row " + i + 1);
			for (int j = 0; j < b.length; j++) {
				b[i][j] = sc.nextInt();
			}

		}
		for (int i = 0; i < c[0].length; i++) {
			
			for (int j = 0; j < c.length; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}

		}

		for (int i = 0; i < c[0].length; i++) {

			for (int j = 0; j < c.length; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();

		}
		sc.close();
	}

}

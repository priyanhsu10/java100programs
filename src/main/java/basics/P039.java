package basics;

import java.util.Scanner;

//Program to Subtract Two Matrices
public class P039 {

	public static void main(String[] args) {

		int[][] a = new int[3][3];
		int[][] b = new int[3][3];
		int[][] c = new int[3][3];
		System.out.println("enter the element for fist matrix");

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < a.length; i++) {
			System.out.println("enter element for row " + (i + 1));
			for (int j = 0; j < a[0].length; j++) {

				a[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < b.length; i++) {
			System.out.println("enter element for row " + (i + 1));
			for (int j = 0; j < b[0].length; j++) {

				b[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < c.length; i++) {

			for (int j = 0; j < c[0].length; j++) {

				c[i][j] = a[i][j] - b[i][j];
			}
		}
		for (int i = 0; i < c.length; i++) {

			for (int j = 0; j < c[0].length; j++) {

				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();
	}

}

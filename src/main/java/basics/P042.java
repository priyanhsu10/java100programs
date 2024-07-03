package basics;

import java.util.Scanner;

//Program to Transpose a Matrix

public class P042 {

	public static void main(String[] args) {

		System.out.println("enter the the diamention M*N");
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();

		int[][] a = new int[m][n];

		for (int i = 0; i < m; i++) {
			System.out.println("enter row");
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();

			}

		}

		int[][] t = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				t[i][j] = a[j][i];
			}
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(t[i][j]+" ");
			}
			System.out.println();
		}

	}
}

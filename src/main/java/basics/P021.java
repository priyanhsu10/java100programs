package basics;

import java.util.Scanner;

//Program to Find the Sum of Natural Numbers
public class P021 {
	public static void main(String[] args) {
	System.out.println("Enter number , program print sum of n natural number ");
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	int sum= 0;
	for(int i=1;i<=n;i++) {
		sum+=i;
	}
	System.out.println("sum of "+n +"natual number ="+sum);
	}

}

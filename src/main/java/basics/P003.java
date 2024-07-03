package basics;

import java.util.Scanner;

//Program to Check if a Number is Even or Odd
public class P003 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number program determine number is even or odd :");
		int n= sc.nextInt();
		
		if(n%2==0) {
			System.out.println(n+" is Even");
		}
		else {
			System.out.println(n +" is Odd");
		}
		sc.close();
	}

}

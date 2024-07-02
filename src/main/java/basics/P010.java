package basics;

import java.util.Scanner;

//Program to Reverse a Number

public class P010 {

	public static void main(String[] args) {
		System.out.println("Enter the number, program will reverse number :");
		Scanner sc= new Scanner(System.in);
		int number = sc.nextInt();
		StringBuilder reverse=new StringBuilder();
       while(number>0) {
    	 int d=  number%10;
    	 
    	 reverse.append(d);
    	 number=number/10;
    	 
    			 
       }
      int r= Integer.valueOf(reverse.toString());
      System.out.println("reverse number = "+r);
	}
}

package basics;

import java.util.Scanner;

//Program to Generate Fibonacci Series
public class P009 {
public static void main(String[] args) {
	System.out.println("enter count till fibonancy series generated , count should be greater than 2 :");
	
	Scanner sc= new Scanner(System.in);
	int count = sc.nextInt();
	
	if(count<2) {
		System.out.println("Enter  greater than 2 ");
		return;
	}
	long pre=0;
	long current=1;
	long next=0;
	
	System.out.print("0 ,1");
	
	for(int i=2;i<count;i++) {
		next=pre+current;
		System.out.print(","+next);
		pre=current;
		current=next;
	}
	
}
}

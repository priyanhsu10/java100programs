package basics;

import java.util.Scanner;

//Program to Check if a Year is a Leap Year
public class P007 {
	
	public static void main(String[] args) {
		System.out.println("Enter year , program will determine year is leap year or not");
		
		Scanner sc=new Scanner(System.in);
		int year= sc.nextInt();
		
	  if((year%4==0 && year%100!=0)||year%400==0) {
		  System.out.println(year +" is leap year");
	  }
	  else {
		  System.out.println(year +" is not lear year");
	  }
		
	}

}

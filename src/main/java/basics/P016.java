package basics;

import java.util.Scanner;

//Program to Convert Binary to Decimal
public class P016 {
	public static void main(String[] args) {
		System.out.println("Enter binary number , program convert into decimal");
		Scanner sc= new Scanner(System.in);
		String s=sc.next();
		char[] sArray=s.toCharArray();
		double result=0;
		
		for(int i=sArray.length-1;i>=0;i--) {
			int ss=  Integer.valueOf( String.valueOf( sArray[i]));
			
			result=result+  ss* Math.pow(2, i);
			
		}
		System.out.println(s +" in decimal="+ result);
	}

}

package basics;

import java.util.Scanner;

//Program to Find the GCD of Two Numbers
public class P013 {
public static void main(String[] args) {
	
	System.out.println("enter 2 number s, program determine the GCD");
	Scanner sc= new Scanner(System.in);
	int a=sc.nextInt();
	int b= sc.nextInt();
	int gcd=1;
	for(int i=1;i<a;i++) {
		
		if(a%i==0 && b%i==0) {
			gcd=i;
		}
	}
	System.out.println("GCD of "+a +" and "+ b +" is "+ gcd);
	
}

}

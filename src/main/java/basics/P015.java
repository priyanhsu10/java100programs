package basics;

import java.util.Scanner;

//Program to Print Multiplication Table
public class P015 {

public static void main(String[] args) {
	System.out.println("Enter nubmer , Program print the table fo number");
	Scanner sc= new Scanner(System.in);
	int m= sc.nextInt();
	for (int i=1;i<=10;i++) {
		System.out.println(m+" ❌ " +i+"=" +i*m);
	}
	
}
}

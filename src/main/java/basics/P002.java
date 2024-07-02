package basics;

import java.util.Scanner;

//Program to Print ASCII Value of a Character

public class P002 {
public static void main(String[] args) {

  Scanner sc= new Scanner(System.in);
  System.out.println("Enter string ,program print charector and its asci value:");
  String s=sc.next();
  char[] stringtochar= s.toCharArray();
   
    for(int i =0; i<stringtochar.length;i++) {
    	
    	System.out.println(stringtochar[i]+ " : "+(int)stringtochar[i]);
    }

	
}
}

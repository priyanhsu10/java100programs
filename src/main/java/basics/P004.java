package basics;

import java.util.List;
import java.util.Scanner;

//Program to Check if a Character is a Vowel or Consonant
public class P004 {
	public static void main(String[] args) {
		
	System.out.println("Enter String Program detemine each letter of string is ovel(O) or consonent (C) :");
	
	Scanner sc= new Scanner(System.in);
	
	String s= sc.next();
	char[] sArray= s.toCharArray();
	
	List<Character> ovels=List.of( 'a','A','e','E','i','I','o','O','u','U');
	
	
	for(int i=0;i<sArray.length;i++) {
		
		if(ovels.contains(sArray[i])){
			System.out.println(sArray[i]+" : O");
		}else {
			System.out.println(sArray[i]+" : C");
		}
		
	}
	sc.close();
	
	}

}

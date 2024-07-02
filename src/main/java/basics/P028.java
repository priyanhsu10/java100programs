package basics;

import java.util.Scanner;

//Program to Search an Element in an Array
public class P028 {
	
	public static void main(String[] args) {
		int[] nums= new int[] {32,234,34,34,54,5,32,4,25,5,6};
		
	   Scanner sc= new Scanner(System.in);
	   System.out.println("Enter the seach nubmer , program determine the number present is array or not");
	   
	   int searchNumber= sc.nextInt();
	   int p=nums.length-1;
	   boolean found=false;
	   for(int i=0;i<nums.length/2;i++) {
		   
		   if(searchNumber==nums[i]|| searchNumber==nums[p]) {
			   found=true;
			   break;
		   }
	   }
	   if(found) {
		   System.out.println("number is present");
	   }else {
		   System.out.println("not present");
	   }
		
	}

}

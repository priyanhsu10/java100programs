package basics;


import java.util.Arrays;

import java.util.List;

//Program to Remove Duplicates from an sorted Array
public class P030 {
public static void main(String[] args) {
 
 int[] nums= new int[]{1,2,2,3,3,4,4,5,5,7}; 	
  
   int n=nums.length-1;
   int j=0;
   for(int i=0;i<n;i++) {
	   
	   if(nums[i]!=nums[i+1]) {
		   
		   nums[j]=nums[i];
		   
		   j++;
				   
	   }
	   
   }
   nums[j++]=nums[n];
   
	for(int i=0;i<j;i++) {
		System.out.println(nums[i]);
	}
}


}

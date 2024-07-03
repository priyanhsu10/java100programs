package basics;

import java.util.Scanner;

//Program to Find the Frequency of an Element in an Array
public class P029 {
	public static void main(String[] args) {
		
		System.out.println("enter number , program find out the frequency of number in the array");
		
		int[] arr = {1, 2, 3, 2, 4, 2, 5, 2, 6};
		
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		int p=arr.length-1;
		int frequncey=0;
		for(int i=0;i<arr.length/2;i++) {
			
			if(num==arr[i]) {
				frequncey++;
			}
			if(num==arr[p]) {
				frequncey++;
			}
			p--;
		}
		
		System.out.println("frequency of number "+num+ " is "+frequncey);
		sc.close();
	}
	

}

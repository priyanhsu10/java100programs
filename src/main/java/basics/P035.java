package basics;

import java.util.Scanner;

//Program to Rotate an Array
public class P035 {
	public static void main(String[] args) {
		
System.out.println("enter the nubmer for rotation for array ");
		Scanner sc = new Scanner(System.in);
		int rotate=sc.nextInt();
		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		int count = arr.length - 1;
		for (int i = count; i >= 1; i--) {
		
			int temp = arr[count];

			for (int j = count; j >= 1; j--) {

				arr[j] = arr[j - 1];
			}
			arr[0] = temp;
		
			if (rotate == 0) {
				break;
			}
			rotate--;
			
		}
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.println(arr[i]);
		}
		sc.close();
	}
}

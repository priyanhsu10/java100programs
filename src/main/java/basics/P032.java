package basics;

import java.util.HashSet;
import java.util.Set;

//Program to Find the Union of Two Arrays
public class P032 {

	public static void main(String[] args) {
		int[] a1 = new int[] { 1, 2, 4, 5, 6, 7 };
		int[] a2 = new int[] { 9, 6, 3, 4, 3, 8, 9 };

		Set<Integer> result = new HashSet<Integer>();
		for (int i = 0; i < a1.length; i++) {
			result.add(a1[i]);
		}
		for (int i = 0; i < a2.length; i++) {
			result.add(a2[i]);
		}
		System.out.println(result);
	}
}

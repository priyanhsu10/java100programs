package basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Program to Find the Intersection of Two Arrays
public class P033 {
	public static void main(String[] args) {
		int[] a1 = new int[] { 1, 2, 4, 5, 6, 7 };
		int[] a2 = new int[] { 9, 6, 3, 4, 3, 8, 7,9 };

		Arrays.sort(a1);
		Arrays.sort(a2);
		List<Integer> result = a1.length > a2.length ? intersection(a2, a1) : intersection(a1, a2);

		System.out.println(result);
	}

	public static List<Integer> intersection(int[] a, int[] b) {
		List<Integer> result=new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {

				if (a[i] == b[j]) {
					result.add(a[i]);
				}
				if (a[i] < b[j]) {
					break;
				}
			}

		}
		return result;
	}
}

package basics;

//Program to Merge Two Arrays
public class P031 {
	public static void main(String[] args) {
		int[] a1 = new int[] { 1, 2, 4, 5, 6, 7 };
		int[] a2 = new int[] { 9, 6, 3, 4, 3, 8 ,9};

		int[] result = new int[a1.length + a2.length];
		int j = 0;

		for (int i = 0; i < result.length; i++) {

			if (i < a1.length) {
				result[i] = a1[i];
				continue;
			}

			result[i] = a2[j];
			j++;

		}
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}

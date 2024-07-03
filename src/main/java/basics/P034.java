package basics;

//Program to Copy an Array
public class P034 {
	public static void main(String[] args) {

		int[] a1 = new int[] { 1, 2, 4, 5, 6, 7 };

		int[] result = new int[a1.length];
		for (int i = 0; i < a1.length; i++) {
			result[i] = a1[i];
		}
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);

		}

	}

}

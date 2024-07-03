package basics;

//Program to Find the Minimum and Maximum Element in an Array
public class P036 {
	public static void main(String[] args) {
		int[] a2 = new int[] { 9, 6, 3, 4, 3, 8, 7, 9 };

		int min = Integer.MAX_VALUE;
		int max = 0;

		for (int i = 0; i < a2.length; i++) {

			if (a2[i] > max) {
				max = a2[i];
			}
			if (a2[i] < min) {
				min = a2[i];
			}
		}
		System.out.println("max= " + max + " min= " + min);

	}

}

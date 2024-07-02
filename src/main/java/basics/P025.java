package basics;

//Program to Find the Second Largest Element in an Array
public class P025 {
	public static void main(String[] args) {
		int[] ar = new int[] { 34, 23, 23, 43, 64, 62, 22 ,1202};

		int largest = 0;
		int sec = 0;

		for (int i = 0; i < ar.length; i++) {

			if (largest < ar[i]) {
				sec = largest;
				largest = ar[i];

			} else {
				if (sec < ar[i]) {
					sec = ar[i];
				}

			}

		}
		System.out.println("second largest " + sec);
	}

}

package basics;

//Program to Print Matrix in Spiral Order
public class P037 {

	public static void main(String[] args) {

		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int top = 0;
		int bottom = matrix.length - 1;
		int left = 0;
		int right = matrix[0].length - 1;

		while (top <= bottom && left <= right) {
			// move left to right
			for (int i = left; i <= right; i++) {

				System.out.print(matrix[top][i] + " ");
			}
			top++;
			// move top to bottom

			for (int i = top; i <= bottom; i++) {

				System.out.print(matrix[i][right] + " ");
			}
			right--;
			// bottom right to left
			if (top <= bottom) {
				for (int i = right; i >= left; i--) {

					System.out.print(matrix[right][i] + " ");
				}
				bottom--;
			}
			// bottom to top
			if (left <= right) {

				for (int i = bottom; i > top; i--) {

					System.out.print(matrix[i][left] + " ");
				}
				left++;
			}

		}
	}

}

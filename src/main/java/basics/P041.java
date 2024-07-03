package basics;

//Program to Check Identity Matrix
public class P041 {
	public static void main(String[] args) {

		int[][] a = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
		boolean result = true;
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a[0].length; j++) {

				if ((i == j &&a[i][j] != 1)) {
					result=false;
					break;
				}
				if (i != j && a[i][j] != 0) {
					result=false;
					break;
				}

			}

		}
		if(result) {
			
			System.out.println("matrix is identiy");
		}else {
			System.out.println("matrix is not identiy");
		}
	}

}

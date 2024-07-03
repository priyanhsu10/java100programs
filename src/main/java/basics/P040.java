package basics;
//Program to Multiply Two Matrices
public class P040 {

	public static void main(String[] args) {
		
		int[][] a=new int[][] {{2,3,4},{5,6,7}};
		int [][]b= new int[][] {{2,3},{4,5},{6,5}};
		
		int [][] c=new int[2][2];
		
	
		 int arow=a.length;
		 int acol=a[0].length;
		 int brow=b.length;
		 int bcol=b[0].length;
		 
		 for(int i=0;i<arow;i++) {
			 for(int j=0;j<bcol;j++) {
				 for(int k=0;k<acol;k++) {
					 c[i][j]+=a[i][k]*b[k][j];
				 }
			 }
		 }
		 
		
		
		
		
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c[0].length;j++) {
				
				
				System.out.print(c[i][j]+ " ");
			}
			System.out.println();
		}
	}
	
}

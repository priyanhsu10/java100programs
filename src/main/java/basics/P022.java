package basics;
//Program to Print Patterns (e.g., star, pyramid)
public class P022 {
	public static void main(String[] args) {
		int row=10,col=10;
	
	  for(int i=1;i<=row;i++) {
		  
		  
		  for(int j=0;j<col;j++) {
			  
			  //print space
			  System.out.print(" ");
			  //print star
			  
			 
		  }
		  for(int j=1;j<=i*2-1;j++) {
			  System.out.print("*");
			  
		  }
		col--; 
		System.out.println();
	  }
	
	}

}

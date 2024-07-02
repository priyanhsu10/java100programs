package basics;
//Program to Find the Largest Element in an Array
public class P024 {
	public static void main(String[] args) {
		
	int[] ar= new int[] {1,4,5,6,103,3,6,7,120};
	
	int p=ar.length-1;
	int largest=0;
	for(int i=0;i<=ar.length/2;i++) {
		
		if(largest>ar[i]&& largest>ar[p]) {
			p--;
			continue;
		}
		largest=ar[i]>ar[p]?ar[i]:ar[p];
		
	}
	System.out.println("largest is "+largest);
	}

}

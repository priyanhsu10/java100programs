package basics;
//Program to Sort an Array
public class P026 {

	public static void main(String[] args) {
		int[] nums= new int[] {4,56,7,7,3,2,64};
		
		for(int i=0;i<nums.length;i++) {
			
			for(int j=i+1;j<nums.length;j++) {
				
				if(nums[i]>nums[j]) {
					int temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
				
			}
			
		}
	  
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
   
	}
}

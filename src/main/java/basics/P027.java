package basics;

//Program to Reverse an Array
public class P027 {
	public static void main(String[] args) {

		int[] nums = new int[] { 1, 2, 43, 5, 6, 3, 2, 5, 2, 5, 56 };
		int p = nums.length - 1;
		for (int i = 0; i <= (nums.length / 2); i++) {

			int temp = nums[i];
			nums[i] = nums[p];
			nums[p] = temp;
			--p;

		}
		
		for(int i=0;i<nums.length;i++) {
			
			System.out.println(nums[i]);
		}
	}

}

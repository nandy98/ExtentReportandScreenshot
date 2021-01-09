package javaPractice;

public class FindMaxAndMin {

	public static void main(String[] args) {

		int[] nums= {10,20,50,40,80,1,60,100};
		
		int max=nums[0];
		int min=nums[0];
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>max) {
				max=nums[i];
			}
		}
		for(int i=0;i<nums.length;i++) {
			if(nums[i]<min) {
				min=nums[i];
			}
		}
		
		System.out.println("Max "+max);
		System.out.println("Min "+min);
	}

}

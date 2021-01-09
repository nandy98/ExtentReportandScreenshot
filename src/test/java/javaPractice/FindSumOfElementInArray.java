package javaPractice;

public class FindSumOfElementInArray {

	
	public static void main(String[] args) {

		int[] arrr= {10,11,12,13,14};
		int sum=0;
		for(int i=0;i<arrr.length;i++) {
			sum=sum+arrr[i];
		}
		
		System.out.println(sum);
	}

}

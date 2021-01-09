package javaPractice;

public class FindDuplicatesInArrays {

	public static void main(String[] args) {
		int[] arr= {1,12,2,1,1,42,42};
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
	}
}

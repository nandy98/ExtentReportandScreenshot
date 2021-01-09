package javaPractice;

public class FindEvenAndOddFromArray {

	

	public static void main(String[] args) {
		
		int ocount=0;
		 int ecount=0;
		int [] arr= {1,2,3,4,5,6,7};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i]);
				ecount++;
			}
		}
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			if((arr[i]%2)!=0) {
				System.out.print(arr[i]);
				ocount++;
			}
		}
	}

}

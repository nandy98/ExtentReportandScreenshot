package javaPractice;

import java.util.Arrays;

public class EqualityOfArrays {

	public static void main(String[] args) {

		int[] arr1= {1,2,3,4,5};
		int[] arr2= {1,2,3,4,5,6};
		
		boolean status = Arrays.equals(arr1, arr2);
		
		if(status==true) {
			System.out.println("Arrays Equal");
		}else {
			System.out.println("Arrays not Equal");
		}
	}

}

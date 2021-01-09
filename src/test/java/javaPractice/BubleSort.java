package javaPractice;

import java.util.Arrays;

public class BubleSort {

	public static void main(String[] args) {
		int[] arr= {0,0,1,1,0,1,1,0};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	
		int[] arr1= {0,0,1,1,0,1,1,0};
		
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		
	}

}

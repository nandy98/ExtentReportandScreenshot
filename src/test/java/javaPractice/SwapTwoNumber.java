package javaPractice;

import java.util.Scanner;

public class SwapTwoNumber {
	
	public static void swap() {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the value of a");
		int a=sc.nextInt();
		System.out.println();
		System.out.print("Enter the value of b");
		int b= sc.nextInt();
		
		b=a+b;
		a=b-a;
		b=b-a;
		
		
		System.out.println("Value of A after swapping:"+a);
		System.out.println("Value of B after swapping:"+b);
	}
	
	public static void main(String[] args) {
		/*SwapTwoNumber obj=new SwapTwoNumber();
		obj.swap();*/
		swap();
	}

}

package javaPractice;

public class PallindromeNumber {

	public static void main(String[] args) {

		int num=13631;
		int dnum=num;
		int rev=0;
		
		while(dnum>0){
			rev=rev*10+dnum%10;
			dnum=dnum/10;
		}
		
		if(num==rev) {
			System.out.println("Number is Pallindrome");
		}
	}

}

package javaPractice;

public class FindSumOfDigit {

	
	
	public void sumDigit() {
		int num=123456789;
		int sum = 0;
		while(num>0) {
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		FindSumOfDigit obj=new FindSumOfDigit();
		obj.sumDigit();
	}

}

package javaPractice;

public class FindOddAndEvenInADigit {

	int num=123456789;
	 int cOdd;
	 int cEven;
	public void count() {
		int check;
		int num=this.num;
		while(num>0) {
			check=num%10;
			num=num/10;
			if(check%2==0) {
				cEven++;
			}else {
				cOdd++;
			}
			
		}
		System.out.println("Even count "+cEven);
		System.out.println("Odd count "+cOdd);
	}
	
	
	public static void main(String[] args) {
		FindOddAndEvenInADigit obj = new FindOddAndEvenInADigit();
		obj.count();
	}
	
}

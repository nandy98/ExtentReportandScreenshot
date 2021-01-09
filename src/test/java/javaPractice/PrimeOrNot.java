package javaPractice;

public class PrimeOrNot {
	
	
	public static void cprime(int num) {
		
		if(num<2) {
			System.out.println("Not a Prime Number");
		}
		int count=0;
		if(num>1) {
			for(int i=2;i<num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count>0) {
			System.out.println("Not a Prime Number");
		}else {
			System.out.println("Prime Number");
		}}
	}
	public static void main(String[] args) {
	
	cprime(-1);
		
		
	}
    
}

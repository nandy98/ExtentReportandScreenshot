package javaPractice;

public class FibonacciSeries {

	public void fibonacci() {
		int n1=0;
		int n2=1;
		int sum=1;
		System.out.print("0"+","+"1");
		for(int i=0;i<=5;i++) {
			
			sum=n1+n2;
			n1=n2;
			n2=sum;
			System.out.print(","+sum);
		}
	}
	
	public static void main(String[] args) {
		FibonacciSeries obj=new FibonacciSeries();
		
		obj.fibonacci();
	}
}

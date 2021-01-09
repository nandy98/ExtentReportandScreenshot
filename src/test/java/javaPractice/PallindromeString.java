package javaPractice;

public class PallindromeString {

	public static void main(String[] args) {
		String str="Nandlal";
		String dstr=str;
		String rev="";
		
		for(int i=dstr.length()-1;i>=0;i--) {
			rev=rev+dstr.charAt(i);
		}
		if(str.equals(rev)) {
			System.out.println("Pallindrome String");
		}else {
			System.out.println("Not Pallindrome String");
		}
		
		System.exit(0);
	}

}

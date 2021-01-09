package javaPractice;

public class RevAString {

	public static String rev() {
		
		String name="Nandlal";
		String revname="";
		
		for(int i=name.length()-1;i>=0;i--) {
			System.out.print(name.charAt(i));
		}
		return revname;
	}
	
	public static void main(String[] args) {

		
		rev();
	}

}

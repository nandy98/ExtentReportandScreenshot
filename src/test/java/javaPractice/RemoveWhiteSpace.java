package javaPractice;

public class RemoveWhiteSpace {
	public static void main(String[] args) {
		String str= "   java   ";
		
		String str1 = str.replaceAll("\\s", "");
		System.out.println(str1);
	}
	
}

package javaPractice;

import java.util.Arrays;

public class StringPlay {

	public static void main(String[] args) {

		String str="My name is Nandlal kumar yadav";
		//System.out.println(str.length());
		
		//1.Reverse of String
		/*for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}*/
		
		//2.Reverse of word
		
		/*String[] str1 = str.split(" ");
		
		for(String word:str1) {
			for(int i=word.length()-1;i>=0;i--) {
				System.out.print(word.charAt(i));
			}
			System.out.print(" ");
		}*/
		
		//3.Arrange char in ascending order.
		
		/*String str1 = str.toLowerCase();
		
		char[] ch = str1.toCharArray();
		
		for(int i=0;i<ch.length-1;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]>ch[j]) {
					int temp=ch[i];
					ch[i]=ch[j];
					ch[j]=(char) temp;
					
					
				}
			}
		}
		System.out.println(Arrays.toString(ch));
		*/
		
		//4.occurance of single ch.
		
		char search = 'a';
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==search) {
				count++;
			}
		}
		System.out.println(count);
		
	} 

}

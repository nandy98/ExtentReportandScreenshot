package javaPractice1;

import java.util.HashMap;
import java.util.Map;

public class CharCount {

	public static void countDigits(String inputString) {
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		
		char[] cArr = inputString.toCharArray();
		
		for(char c:cArr) {
			if(hm.containsKey(c)) {
				hm.put(c,hm.get(c)+1 );
			}else{
				hm.put(c,1);
			}
		}
		for (Map.Entry entry : hm.entrySet()) { 
            System.out.println(entry.getKey() + " " + entry.getValue()); 
        } 
	}
	
	public static void main(String[] args) {

		countDigits("Nandlal is my love");
	}

}

package javaPractice;

public class RemoveJunk {

	public static void main(String[] args) {
		String str="@@@Java####";
		String str1 = str.replaceAll("[^0-9a-zA-Z]", "");
		System.out.println(str1);
	}

}

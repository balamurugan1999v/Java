package string;

import java.util.Optional;

public class ReverseString {

	public static void main(String[] args) {

		String str = "Balamurugan";
		Optional<String> reverseString = str.chars().mapToObj(s -> String.valueOf((char) s)).reduce((a, b) -> b+a);
		System.out.println(reverseString.get());
		
		
		StringBuilder strBuilder = new StringBuilder(str);
		String reverseString1 = strBuilder.reverse().toString();
		System.out.println(reverseString1);
		
		StringBuffer strBuffer = new StringBuffer(str);
		String reverseString2 = strBuffer.reverse().toString();
		System.out.println(reverseString2);
		
		
		String s = "I love programming!";
		StringBuffer strBuff = new StringBuffer(s);
		String rev= strBuff.reverse().toString();
		System.out.println(rev);
		
	}

}

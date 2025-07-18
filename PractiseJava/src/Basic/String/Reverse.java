package Basic.String;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Reverse {
	
	public static void main(String args[]) {
		String str ="HEllo";
		String rev1 = new StringBuilder(str).reverse().toString();
		System.out.println(rev1);
		String rev2 ="";
		for(int i=str.length()-1;i>=0;i--) {
			rev2 += str.charAt(i);
		}
		System.out.println(rev2);
		System.out.println(rev1 == rev2);

		System.out.println(rev1.equals(rev2));
	}

}

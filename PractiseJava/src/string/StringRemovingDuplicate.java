package string;

import java.util.ArrayList;
import java.util.List;

public class StringRemovingDuplicate {

	public static void main(String[] args) {
		String str = "I love programming and I like programming";
		String[] strArray = str.split(" ");
		String s="";
		List<String> list = new ArrayList<String>();
		for(String a: strArray) {
			if(!list.contains(a)) {
				s += a + " ";
				list.add(a);
			}
		}
		System.out.println(s);
	}

}

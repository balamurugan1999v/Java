package Basic;

import java.util.Set;
import java.util.stream.Collectors;

public class SortAnArray {

	public static void main(String[] args) {
		String s = "abc-de3-2fg";
		Set<Character> set = s.chars()
			    .mapToObj(ch -> (char)ch)
			    .collect(Collectors.toSet());
		
		System.out.println(set);
	}

}

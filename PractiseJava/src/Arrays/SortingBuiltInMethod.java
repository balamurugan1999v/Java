package Arrays;

import java.util.Arrays;

public class SortingBuiltInMethod {

	public static void main(String[] args) {

		int[] arr = {1,5,2,9,4};
		Arrays.sort(arr);
		for(int i:arr) {
			System.out.println(i);
		}
		
		char[] ch = {'a','e','z','d'};
		Arrays.sort(ch);
		for(char c:ch) {
			System.out.println(c);
		}
		
	}

}

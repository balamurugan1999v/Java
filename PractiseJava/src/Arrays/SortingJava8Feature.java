package Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class SortingJava8Feature {

	public static void main(String[] args) {

		System.out.println(System.currentTimeMillis());
		Integer[] arr = {1,5,2,9,4};
		Arrays.sort(arr, Comparator.reverseOrder());
		for(Integer i:arr) {
			System.out.println(i);
		}
		System.out.println(System.currentTimeMillis());
		
		String[] str = {"Ashok","Gtm","Bmg"};
		Arrays.sort(str, Comparator.reverseOrder());
		for(String i:str) {
			System.out.println(i);
		}
		System.out.println(System.currentTimeMillis());
		
		String[] str1 = {"Ashok","Gtm","Bmg"};
		str1 = Arrays.stream(str1).sorted().toArray(String[]::new);
		for(String i:str1) {
			System.out.println(i);
		}
		System.out.println(System.currentTimeMillis());
		
		String[] str2 = {"Kumar","Adam","Bmg"};
		Arrays.sort(str2, Comparator.naturalOrder());
		for(String i:str2) {
			System.out.println(i);
		}
		System.out.println(System.currentTimeMillis());
		
	}

}

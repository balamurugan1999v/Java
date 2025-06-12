package Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SearchingJava8 {

	public static void main(String[] args) {

		//THere is no direct java8 method to search but we can convert a array to stream and use in the stream api
		
		int[] i = {12,3,54,45,98,3};
		Scanner sc = new Scanner(System.in);
		int find = sc.nextInt();
		int count =0;
		System.out.println("Hello");
		Arrays.stream(i).filter(a -> a==find).forEach(a -> System.out.println(a));
		//Arrays.stream(i).forEach(a -> System.out.println(a));

	}

}

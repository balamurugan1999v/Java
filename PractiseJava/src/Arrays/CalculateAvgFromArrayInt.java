package Arrays;

import java.util.Arrays;

public class CalculateAvgFromArrayInt {

	public static void main(String[] args) {

		int arr[] = {12,3,4,5,6,7,8,9,9890};
		int sum =
		Arrays.stream(arr).sum();
		System.out.println(sum);
		double d = sum/arr.length;
		System.out.println(d);
		String s= String.format("%.2f", d);
		System.out.println(s);
	}

}

package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SearchingBuiltInMethod {

	public static void main(String[] args) {
		int[] i = {1,2,3,4,5,6,7,8};
		//int[] i = {12,3,54,45,98,3};
		Scanner sc = new Scanner(System.in);
		int find = sc.nextInt();
		//Linear search we dont have any built in functions
		//Binary search we have Arrays.binarySearch(array,findNumber)
		if(Arrays.binarySearch(i,find)>=0) {
			System.out.println("It is present");
		}else {
			System.out.println("It is not present");
		}
		sc.close();
	}

}

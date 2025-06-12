package Arrays;

import java.util.Scanner;

public class SearchingTraditional {

	public static void main(String[] args) {

		int[] i = {12,3,54,45,98,3};
		Scanner sc = new Scanner(System.in);
		int find = sc.nextInt();
		int count = 0;
		for(int iter:i) {
			if(iter == find) {
				count++;
			}
		}
		System.out.println(find +" number present "+count+" times in the given array");
		sc.close();

	}

}

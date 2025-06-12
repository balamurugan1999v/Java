package Arrays;

import java.util.Scanner;

public class Initialize {

	public static void main(String[] args) {

		int[] i = {12,3,4,5};
		
		for(int iter:i) {
			System.out.println(iter);
		}
		
		int[] j = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int it=0;it<5;it++) {
			j[it] = sc.nextInt();
		}
		for(int iter:j) {
			System.out.println(iter);
		}

	}

}

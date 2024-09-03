package Pattern;

import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer rowsCount= sc.nextInt();
		for(int i =0 ;i<rowsCount ;i++) {
			for(int k=0; k<(rowsCount-i-1);k++) {
				System.out.print(" ");
			}
			for(int j=0 ; j<=i ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i = rowsCount-1 ; i>0 ; i--) {
			for(int k=0; k<(rowsCount-i);k++) {
				System.out.print(" ");
			}
			for(int j=i; j>0; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
//
//  *
// * *
//* * *
// * *
//  *
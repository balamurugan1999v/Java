package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RightAndLeftShift {

	public static void main(String[] args) {
		int[] right = {1,2,3,4,5,6};
		int[] left = {1,2,3,4,5,6};
		Scanner sc = new Scanner(System.in);
		int rotationInput = 2;
		int rotationLeft = rotationInput%left.length;
		int rotationRight = rotationInput%right.length;
		for(int iteration=0; iteration<rotationRight;iteration++) {
			int temp = right[right.length-1];
			for(int i=right.length-1;i>=1;i--) {
				right[i]=right[i-1];
			}
			right[0]=temp;
		}
		for(int iteration=0; iteration<rotationLeft;iteration++) {
			int temp = left[0];
			for(int i=0;i<left.length-1;i++) {
				left[i]=left[i+1];
			}
			left[left.length-1]=temp;
		}
		
		Arrays.stream(right).forEach(s -> System.out.print(s+" "));
		System.out.println();
		Arrays.stream(left).forEach(s -> System.out.print(s+" "));
//		System.out.println();
//		
//		int[] rightNew = {1,2,3,4,5,6};
//		int[] leftNew = {1,2,3,4,5,6};
//		System.out.println(rotationRight);
//		int[] temp = new int[rotationRight+1];
//		for(int i=0;i<rotationRight+1;i++) {
//			temp[i]= rightNew[i+1+rotationRight];
//		}
//		Arrays.stream(temp).forEach(s -> System.out.print(s+" "));
//		System.out.println();
//		for(int i=rotationRight+1;i<rightNew.length;i++) {
//			rightNew[i] = rightNew[i-rotationRight];
//		}
//		for(int i=0;i<rotationRight+1;i++) {
//			rightNew[i] = temp[i];
//		}
//		Arrays.stream(rightNew).forEach(s -> System.out.print(s+" "));
	}

}


package ProgramTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProgramTest {

	public static void main(String[] args) {
		int[] i = new int[4];
		int[] j = new int[6];
		int[] mergedArray = new int[10];
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(4, 5, 13, 22));
		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(0, 9, 3, 7, 12, 11 ));
		int it=0;
		for(int iter : list) {
			i[it] = iter;
			System.out.println(i[it]);
			it++;
		}
		//System.out.println(i);
		 it=0;
		for(int iter : list2) {
			j[it] = iter;
			System.out.println(j[it]);
			it++;
		}
		List<Integer> mergedList = new ArrayList<Integer>();
		mergedList.addAll(list);
		mergedList.addAll(list2);
		
			
		for(int iter=0;iter<4;iter++) {
			mergedArray[iter] =i[iter]; 
		}
		for(int iter=4;iter<10;iter++) {
			mergedArray[iter] =j[iter-4]; 
		}
		System.out.println("Merged Array");
		for(int iter=0;iter<10;iter++) {
			System.out.println(mergedArray[iter]); 
		}
		//System.out.println(mergedArray);
		
		int maxValue = 0;
		int secondMaxValue = 0;
		for(int iter=0;iter<10;iter++) {
			
			if(maxValue < mergedArray[iter]) {
				secondMaxValue = maxValue;
				maxValue = mergedArray[iter];
			} else if(mergedArray[iter] > secondMaxValue) {
				secondMaxValue = mergedArray[iter];
			}
		}
		System.out.println(" Result "+secondMaxValue);
		maxValue = 0;
		secondMaxValue = 0;
		for(Integer intValue : mergedList) {
			if(maxValue < intValue) {
				secondMaxValue = maxValue;
				maxValue = intValue;
			} else if(intValue > secondMaxValue) {
				secondMaxValue = intValue;
			}
		}
		
		System.out.println(" Result "+secondMaxValue);
		//int i[4] = { 4, 5, 13, 22 };
		//int j[] = { 0, 9, 3, 7, 12, 11 };
		
	}

}

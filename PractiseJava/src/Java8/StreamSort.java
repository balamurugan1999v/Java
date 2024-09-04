package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StreamSort {

	public static void main(String[] args) {
		List<String> stringList =  new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		int sizeOfList = sc.nextInt();
		for(int i=0; i<sizeOfList ;i++) {
			String current = sc.next();
			stringList.add(current);
		}
		
		List<String> sortedList = stringList.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		
		List<Integer> intList = new ArrayList<Integer>();
		for(int i=0; i<sizeOfList ;i++) {
			int current = sc.nextInt();
			intList.add(current);
		}
		List<Integer> sortedIntList = intList.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedIntList);
	}

}

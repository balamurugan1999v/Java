package Collections.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SearchingTraditional {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>(Arrays.asList(1,3,5,6,1));
		
		Scanner sc = new Scanner(System.in);
		int find = sc.nextInt();
		System.out.println(set);
		for(Integer i:set) {
			if(i.equals(find)) {
				System.out.println("It is present");
			}
		}
	}

}

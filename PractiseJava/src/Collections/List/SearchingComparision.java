package Collections.List;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class SearchingComparision {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int find = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		boolean first=false, second=false,thirdBoolean=false,fourth =false,fifth=false;
		for(int i=0;i<100000;i++) {
			list.add(i);
		}
		long before4 =System.currentTimeMillis();
		if(list.contains(find)) {
			fourth=true;
		}
		long after4 =System.currentTimeMillis();
		long before2 =System.currentTimeMillis();
		second = list.stream().anyMatch(a -> a== find);
		long after2 =System.currentTimeMillis();

		long before1 =System.currentTimeMillis();
		for(Integer s:list) {
			if(find == (s)) {
				first = true;
			}
		}
		long after1 =System.currentTimeMillis();
		
		long before3 =System.currentTimeMillis();
		String third = list.stream().filter(a -> a.equals(find)).map(a-> a.toString()).collect(Collectors.joining());
		if(third != null) {
			thirdBoolean = true;
		}
		long after3 =System.currentTimeMillis();
		
		long before5 =System.currentTimeMillis();
		Set<Integer> set = new HashSet<>(list);
		long after5 =System.currentTimeMillis();
		long before6 =System.currentTimeMillis();		
		if(set.contains(find)) {
			fifth=true;
		}
		long after6 =System.currentTimeMillis();
		System.out.println("Traditional " + (after1-before1));
		System.out.println("Any match " + (after2-before2));
		System.out.println("Filter " + (after3-before3));
		System.out.println("Contains " + (after4-before4));
		System.out.println("Convertion to hashset " + (after5-before5));
		System.out.println("Contains in hashset " + (after6-before6));
		System.out.println(first+" "+ second+ " "+ thirdBoolean+ " "+ fourth + " "+ fifth);
		sc.close();

	}

}

//output
/*
0
Traditional 5
Any match 12
Filter 24
Contains 0
true true true true

55555
Traditional 9
Any match 31
Filter 28
Contains 6
true true true true

98988
Traditional 8
Any match 24
Filter 36
Contains 11
true true true true

100000
Traditional 7
Any match 30
Filter 28
Contains 11
false false true false

99999
Traditional 5
Any match 21
Filter 21
Contains 10
Convertion to hashset 43
Contains in hashset 0
true true true true true


 * */

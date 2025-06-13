package Collections.List;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrVsLinkList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer find = sc.nextInt();

		List<Integer> linkedList = new  LinkedList<Integer>();
		List<Integer> arrayList = new ArrayList<Integer>();
		boolean first=false, second=false,third=false,fourth =false,fifth=false;
		boolean lfirst=false, lsecond=false,lthird=false,lfourth =false,lfifth=false;
		for(Integer i=0;i<1000000;i++) {
			linkedList.add(i);
			arrayList.add(i);
		}
		long before1 =System.currentTimeMillis();
		if(arrayList.contains(find)) {
			first=true;
		}
		long after1 =System.currentTimeMillis();
		long lbefore1 =System.currentTimeMillis();
		if(linkedList.contains(find)) {
			lfirst=true;
		}
		long lafter1 =System.currentTimeMillis();

		long lbefore2 =System.currentTimeMillis();
		lsecond = linkedList.stream().anyMatch(a -> a.equals(find));
		long lafter2 =System.currentTimeMillis();

		long before2 =System.currentTimeMillis();
		second = arrayList.stream().anyMatch(a -> a.equals(find));
		long after2 =System.currentTimeMillis();
		

		
		long before3 =System.currentTimeMillis();
		for(Integer s:arrayList) {
			if(find.equals(s)) {
				third = true;
			}
		}
		long after3 =System.currentTimeMillis();
		
		long lbefore3 =System.currentTimeMillis();
		for(Integer s:linkedList) {
			if(find.equals(s)) {
				lthird = true;
			}
		}
		long lafter3 =System.currentTimeMillis();
		
		System.out.println("ArrayList Contains " + (after1-before1));
		System.out.println("LinkedList Contains " + (lafter1-lbefore1));
		System.out.println("ArrayList Anymatch " + (after2-before2));
		System.out.println("LinkedList Anymatch " + (lafter2-lbefore2));
		System.out.println("ArrayList Traditional " + (after3-before3));
		System.out.println("LinkedList Traditional " + (lafter3-lbefore3));
		System.out.println(first+" "+ lfirst);
		System.out.println(second+" "+ lsecond);
		System.out.println(third+" "+ lthird);
		sc.close();
	}

}

/*
50982
ArrayList Contains 8
LinkedList Contains 6
ArrayList Anymatch 9
LinkedList Anymatch 27
ArrayList Traditional 32
LinkedList Traditional 57
true true
true true
true true


 
 */

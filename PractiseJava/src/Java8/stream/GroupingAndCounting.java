package Java8.stream;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GroupingAndCounting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] playList = new int[size];
        for(int i=0;i<size;i++){
            playList[i] = sc.nextInt();
        }
        Map<Integer,Long> map = Arrays.stream(playList).collect(Collectors.grouping( c -> c, Collectors.counting()));
        Long maximum = 0L;
        for(Long l : map.getValues()){
            if(l>maximum){
                maximum = l;
            }
        }
        System.out.println(l);
	}

}

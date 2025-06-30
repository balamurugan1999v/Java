package Java8.stream;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GroupingAndCounting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Long size = sc.nextLong();
        int count = 0;
        Long[] playList = new Long[Integer.parseInt(size.toString())];
        for(int i=0;i<size;i++){
            playList[i] = sc.nextLong();
        }
        Map<Long,Long> map = Arrays.stream(playList).collect(Collectors.groupingBy( c -> c, Collectors.counting()));
        Long maximum = 0L;
        for(Long l : map.values()){
            if(l >maximum){
                maximum = l;
            }
        }
        for(Entry<Long, Long> m : map.entrySet()) {
        	if(maximum == m.getValue()) {
        		count++;
        	}
        }
        System.out.println(count);
        sc.close();
	}

}

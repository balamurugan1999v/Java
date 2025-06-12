package Basic;

import java.util.*;
public class MapValue
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Integer[] metaData = {1,2,12,1,2,4,5,4,1,5,2,5,3,2,10,10};
		Map<Integer,Integer> map = new HashMap<>();
		for(Integer i : metaData){
		    if(map.containsKey(i)){
		        Integer value = map.get(i)+1;
		        map.put(i,value);
		    } else{
		        map.put(i,1);
		    }
		}
		System.out.println(map);
	}
}


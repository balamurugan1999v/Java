package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class MapOperation {

	public static void main(String[] args) {
		String str ="abcddefghikkkk";
		Map<Character,Integer> map = new HashMap<Character, Integer>();
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(map.containsKey(ch[i])) {
				Integer in = map.get(ch[i]);
				in++;
				map.put(ch[i], in);
			}else {
				map.put(ch[i], 1);
			}
		}
		System.out.println(map);
		
	}

}

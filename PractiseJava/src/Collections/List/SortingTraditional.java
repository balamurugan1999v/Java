package Collections.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingTraditional {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(5,3,7,2,1));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				if(list.get(i)>list.get(j)) {
					int ivalue = list.get(i);
					int jvalue = list.get(j);
					list.remove(i);
					list.add(i,jvalue);
					list.remove(j);					
					list.add(j,ivalue);
				}
			}
		}
		System.out.println(list);

	}

}

/*
5
[1, 2, 3, 5, 7]
*/

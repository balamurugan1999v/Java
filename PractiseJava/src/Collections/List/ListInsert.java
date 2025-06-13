package Collections.List;

import java.util.ArrayList;
import java.util.List;

public class ListInsert {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(1,19);
		list.add(1,20);
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
	}

}

package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,4,5,6,7));
		list.stream().forEach( s->
		{
			if(s % 2 ==0) {
				System.out.println("it is devide by 2 and the value is "+ s);
			}
		}
		);
	}

}

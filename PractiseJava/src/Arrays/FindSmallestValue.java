package Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindSmallestValue {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,6,0};
		List<Integer> list = Arrays.stream(arr).boxed().sorted().collect(Collectors.toList());
		Optional<Integer> optValue = Arrays.stream(arr).boxed().sorted().findFirst();
		System.out.println(optValue.get());
		System.out.println(list.get(0));
	}

}

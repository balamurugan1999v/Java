package Basic.Helper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import Basic.ExceptionHandlingTest;

public class ProcessingData {

	public List<String> findTheGivenStartingString(String startingStr) {
		List<String> list1 = new ArrayList<>(Arrays.asList("First", "Second", "Third"));
		List<String> list2 = new ArrayList<>(Arrays.asList("Fourth", "Fifth", "Sixth"));
		List<List<String>> finalList = new ArrayList<List<String>>();
		finalList.add(list1);
		finalList.add(list2);
		List<String> resultList =  finalList.stream().flatMap(s -> s.stream())
				.filter(s -> s.contains(startingStr)).collect(Collectors.toList());
		return resultList;
	}
	public void checkTheGivenStartingString(String startingStr) {
		List<String> list1 = new ArrayList<>(Arrays.asList("First", "Second", "Third"));
		List<String> list2 = new ArrayList<>(Arrays.asList("Fourth", "Fifth", "Sixth"));
		List<List<String>> finalList = new ArrayList<List<String>>();
		finalList.add(list1);
		finalList.add(list2);
		finalList.stream().flatMap(s -> s.stream())
				.filter(s -> s.contains(startingStr)).findAny()
				.orElseThrow(() -> new ExceptionHandlingTest("String not present"));
	}
}

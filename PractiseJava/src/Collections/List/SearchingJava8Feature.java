package Collections.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SearchingJava8Feature {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String find = sc.next();
		List<String> list = new ArrayList<>(Arrays.asList("TV","friDge","WashingMachine"));
		System.out.println(list.stream().anyMatch(a -> a.equalsIgnoreCase(find)));
		sc.close();
	}

}

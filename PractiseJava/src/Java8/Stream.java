package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Stream {

	public static void main(String args[]) {
		String[] list;
		Scanner sc = new Scanner(System.in);
		String sentence = "Hi! Hello, how are you I am good thank you You are my inspiration ";
		list = sentence.split(" ");
		List<String> strList = new ArrayList<String>();
		for (String str : list) {
			strList.add(str);
		}
		long count = strList.stream().filter(s -> s.equalsIgnoreCase("you")).count();
		System.out.println(count);
		Optional<String> count2 = Optional.ofNullable(strList.stream().filter(s -> s.equalsIgnoreCase("you"))
				.filter(s -> s.equals("You")).findAny().orElse(""));
		Optional<String> count1 = Optional.ofNullable(strList.stream().findAny().orElse(""));
		System.out.println(count2);
		System.out.println(count1);
		sc.close();
	}

}

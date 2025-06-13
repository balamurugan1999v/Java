package Collections.List;
import java.util.*;
public class SearchingBuiltInMethod {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String find = sc.next();
		List<String> list = new ArrayList<>(Arrays.asList("TV","Bridge","WashingMachine"));
		if(list.contains(find)) {
			System.out.println("It is present");
		}
	}

}

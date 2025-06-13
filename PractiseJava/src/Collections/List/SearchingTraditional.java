package Collections.List;
import java.util.*;

public class SearchingTraditional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String find = sc.next();
		List<String> list = new ArrayList<>(Arrays.asList("TV","Bridge","WashingMachine"));
		for(String s:list) {
			if(find.equalsIgnoreCase(s)) {
				System.out.println("It is present");
			}
		}
	}

}
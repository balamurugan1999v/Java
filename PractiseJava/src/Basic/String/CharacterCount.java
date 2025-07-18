package Basic.String;

public class CharacterCount {

	public static void main(String[] args) {
		// One mroe class is there inside the Basic package
		
		String s="Hello World";
		char find = ' ';
		int
		count = (int) s.chars()
				.filter( i -> i==find).count();
		System.out.println(count);

	}

}

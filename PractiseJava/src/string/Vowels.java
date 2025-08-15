package string;

public class Vowels {

	public static void main(String[] args) {
		String str = "Balamurugan";
		long vowelCount = str.chars().filter(value -> "AEIOUaeiou".indexOf(value) >= 0).count();
		System.out.println(vowelCount);
		
	}

}

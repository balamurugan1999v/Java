package Basic;

public class CharacterCount {
	public static void main(String args[]) {
		String find = "Thisis the value here yes";
		char[] array = find.toCharArray();
		int count =0;
		for(char ch : array) {
			if(ch == 's') {
				count++;
			}
		}
		System.out.println(count);
	}

}

package Basic;

public class VowelsPresentInString {

	public static void main(String[] args) {

		String str = "ISPresent";
		char[] chrArray = str.toCharArray();
		for(int i=0; i<str.length(); i++){
			if((chrArray[i] == 'a' || chrArray[i] == 'e' || chrArray[i] == 'i' || chrArray[i] == 'o' || chrArray[i] == 'u')
			||
			(chrArray[i] == 'A' || chrArray[i] == 'E' || chrArray[i] == 'I' || chrArray[i] == 'O' || chrArray[i] == 'U')){
				System.out.println("Vowel " + chrArray[i]); 
			}
		}
	}

}

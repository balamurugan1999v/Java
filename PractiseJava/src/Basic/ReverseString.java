package Basic;

public class ReverseString {

	/* 1st type
	 public static void main(String[] args) {
		System.out.println("Hii Please Enter the string");
		Scanner sc = new Scanner(System.in);
		String input1 = sc.next();
		String input = sc.nextLine();
		String reverseString = "";
		String reverseString1 = "";
		for(int i=input.length()-1; i>=0 ; i--) {
			reverseString += input.charAt(i);
		}
		for(int i=input1.length()-1; i>=0 ; i--) {
			reverseString1 += input1.charAt(i);
		}
		System.out.println(reverseString);
		System.out.println(reverseString1);

	}
	
	Output:
		Hii Please Enter the string --> Sysout
		What are you doing da --> input
		ad gniod uoy era --> Output
		tahW --> Output 
		
		
		Explanation:
			Here first word only get by sc.next() followed words are obtained by nextLine()
		
		*/
	
	
	//2nd Type
	/*
	public static void main(String[] args) {
		System.out.println("Hii Please Enter the string");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String input1 = sc.next();
		String reverseString = "";
		String reverseString1 = "";
		for(int i=input.length()-1; i>=0 ; i--) {
			reverseString += input.charAt(i);
		}
		for(int i=input1.length()-1; i>=0 ; i--) {
			reverseString1 += input1.charAt(i);
		}
		System.out.println(reverseString);
		System.out.println(reverseString1);

	}
	
	Output:
		Hii Please Enter the string --> Sysout
		What are you doing --> Input
		How is it? --> Input1
		gniod uoy era tahW --> Output reverseString
		woH --> Output reverseString1 here next() only obtain first word of the sentense.
		*/
	
	//3
	
	public static void main(String args[]) {
		StringBuilder str = new StringBuilder("Hello");
		System.out.println(str.reverse());
		//Output: olleH
		
		str.append(" How are you");
		System.out.println(str.reverse());
		//uoy era woH Hello
		//Here previously reversed string now reverse again so Hello printed as original
		System.out.println(str.reverse());
		// Output: olleH How are you
		// Now again it is reversed. 
		String finalString = "";
		for(int i = str.length() -1 ; i>=0; i--) {
			finalString += str.charAt(i);
		}
		System.out.println(finalString);
		// Output : uoy era woH Hello
		
		StringBuffer strbuf = new StringBuffer();
		strbuf.append("Now it is String buffer time!");
		strbuf.reverse();
		System.out.println(strbuf);
		//Output: !emit reffub gnirtS si ti woN
		System.out.println(strbuf.reverse());
		//Output: Now it is String buffer time!
		
		StringBuffer strbuf1 = new StringBuffer("Here itself created");
		System.out.println(strbuf1.reverse());
		//Output: detaerc flesti ereH
		
		finalString = "";
		for(int i = strbuf1.length() -1 ; i>=0; i--) {
			finalString += strbuf1.charAt(i);
		}
		System.out.println(finalString);
		// Output : Here itself created
	}
	

}

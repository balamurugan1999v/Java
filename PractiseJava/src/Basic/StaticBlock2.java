package Basic;

import java.util.Scanner;

public class StaticBlock2 {
	
	static {
		StaticBlock2 obj = new StaticBlock2();
		System.out.println("Static Block");
	}
	
	StaticBlock2(){
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		StaticBlock2 obj = new StaticBlock2();
		System.out.println("Hello");

	}

}

/*Output:

Constructor
Static Block
Constructor
Hello
 
 */

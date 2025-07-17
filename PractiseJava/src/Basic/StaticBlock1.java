package Basic;

import java.util.Scanner;

public class StaticBlock1 {
	
	static {
		System.out.println("Static Block");
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		System.out.println(a);
		sc.close();
	}
	
	StaticBlock1(){
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		System.out.println("Hello");
		StaticBlock1 obj = new StaticBlock1();

	}

}

/*Output:

Static Block
5 // Input. Note: After giving input only it moving to next step
5
Hello
Constructor
 
 */

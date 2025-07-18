package Basic;

public class StaticBlock {
	
	static {
		System.out.println("Static Block");
	}
	
	StaticBlock(){
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		System.out.println("Hello");
		StaticBlock obj = new StaticBlock();

	}

}

/*Output:

Static Block
Hello
Constructor

 
 */

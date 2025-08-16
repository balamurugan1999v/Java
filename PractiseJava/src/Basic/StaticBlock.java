package Basic;

public class StaticBlock {
	
	static {
		System.out.println("Static Block");
	}
	{
		System.out.println("Hello");
	}
	StaticBlock(){
		System.out.println("Constructor");
	}

	public static void main(String[] args) {

		StaticBlock obj = new StaticBlock();
		System.out.println("Hello1");
		StaticBlock obj1 = new StaticBlock();

	}

}

/*Output:

Static Block
Hello
Constructor

 
 */

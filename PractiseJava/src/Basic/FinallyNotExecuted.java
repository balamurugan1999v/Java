package Basic;

public class FinallyNotExecuted {

	public static void main(String[] args) {
		
/*	try {
			callSysoutMethodToPrintSomething();
			return;
		} catch(Exception e){
			System.out.println("Catch");
		} finally {
			System.out.println("Finally");
		}
	}

	private static void callSysoutMethodToPrintSomething() {
		System.out.println("Coming here");
	}
	
	 Output:
	 	Coming here
		Finally
	 */
		
		int result =callThisCustomMethod();
	}

	private static int callThisCustomMethod() {
		int result =0;
		try {
			System.out.println("Entered into try");
			System.exit(0);
			return result;
		}catch(Exception e) {
			System.out.println("Catch");
		}finally {
			System.out.println("Finally");
		}
		return result;		
	}

}

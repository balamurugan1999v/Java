package Basic;

import java.util.List;

import Basic.Helper.ProcessingData;

public class ExceptionHandlingTest extends RuntimeException {
	private String message;

	public ExceptionHandlingTest(String msg) {
		super(msg);
		this.message = msg;
	}

	public static void main(String[] args) {
		ProcessingData obj = new ProcessingData();
		String passingValue ="F";
		System.out.println("passingValue "+passingValue);
		obj.checkTheGivenStartingString(passingValue);
		List<String> result = obj.findTheGivenStartingString(passingValue);
		System.out.println(result);
		// System.out.println(new ExceptionHandlingTest(result));
		/*
		 * Output:
		 * 
passingValue X
Exception in thread "main" Basic.ExceptionHandlingTest: String not present
	at Basic.Helper.ProcessingData.lambda$4(ProcessingData.java:31)
	at java.base/java.util.Optional.orElseThrow(Optional.java:403)
	at Basic.Helper.ProcessingData.checkTheGivenStartingString(ProcessingData.java:31)
	at Basic.ExceptionHandlingTest.main(ExceptionHandlingTest.java:19)
	
	*
	*
passingValue F
[First, Fourth, Fifth]
	*/
		

	}

	

}

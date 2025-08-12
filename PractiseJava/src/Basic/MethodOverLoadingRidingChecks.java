package Basic;

public class MethodOverLoadingRidingChecks {

	public static void main(String[] args) {


		MethodOverLoadingRidingChecks m = new MethodOverLoadingRidingChecks();
		int a = m.getDataFromMethod(0);
		int b = m.getDataFromMethod(a);
		String c = m.getDataFromMehtod(b);
		System.out.println(c);

	}

	private int getDataFromMethod(int a) {
		if (a==1) {
			return 5;
		} else
		return 0;
	}

	private String getDataFromMehtod(int b) {
		System.out.println("Here checking");
		return "Result";
	}

}

//Output:
//	Here checking
//	Result

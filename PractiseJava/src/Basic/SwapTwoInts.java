package Basic;

public class SwapTwoInts {

	public static void main(String[] args) {

		//Scenario 1
		int a = 10;
		int b = 9;
		System.out.println(a +" "+ b);
		int c = a;
		a = b;
		b = c;
		System.out.println(a +" "+ b);
		
		
		//Scenario 2
		
		int x = 10;
		int y = 9;
		System.out.println(x +" "+ y);
		x = x+y; // x = 19, y = 9
		y = x - y; // x = 19, y = 10
		x = x - y; // x = 9, y = 10
		System.out.println(x +" "+ y);
	}

}

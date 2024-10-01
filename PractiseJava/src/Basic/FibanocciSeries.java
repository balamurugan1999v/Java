package Basic;

public class FibanocciSeries {

	public static void main(String[] args) {
		int start = 0, increment = 1;
		int result = 0;
		int size = 10;
		for(int i=0;i<size;i++) {

			System.out.println(result);
			start =result + increment;
			result = increment;
			increment = start;
		}

		
	}

	/*
	 * Output:
	 * 0
	 * 1
	 * 1 
	 * 2
	 * 3
	 * 5
	 * 8
	 * */
}

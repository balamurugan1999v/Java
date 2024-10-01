package Basic;
import java.util.*;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int times = 0;
		for(int i=1;i<number-1;i++) {
			if(number%i ==0) {
				times +=1;
			}
		}
		if(times ==1 || number ==2) {
			System.out.println("PrimeNumber");
		} else {
			System.out.println("Not");
		}
	}

}

package Basic;
import java.util.*;

public class MultipleStrings {

	public static void main(String[] args) {

		/*
		String a,b,c,d ;
		Scanner sc = new Scanner(System.in);
		a = sc.next();
		sc.nextLine();
		b = sc.nextLine();
		c = sc.nextLine();
		d = sc.nextLine();
	    int e = sc.nextInt();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);

	}

	Input :
		Hello
		Mydear
		I am C
		I am D
		5
	Output:		
		Hello
		Mydear
		I am C
		I am D
		5
		*/
		
		
		//Next scenario
		/*
		String a,b,c,d ;
		Scanner sc = new Scanner(System.in);
		a = sc.next();
		b = sc.nextLine();
		c = sc.nextLine();
		d = sc.nextLine();
	    int e = sc.nextInt();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);

		//Output
		Hello
		Mydear
		I am C
		I am D
		5Exception in thread "main" java.util.InputMismatchException
			at java.base/java.util.Scanner.throwFor(Scanner.java:964)
			at java.base/java.util.Scanner.next(Scanner.java:1619)
			at java.base/java.util.Scanner.nextInt(Scanner.java:2284)
			at java.base/java.util.Scanner.nextInt(Scanner.java:2238)
			at Basic.MultipleStrings.main(MultipleStrings.java:46)
		
			
		Explanation:
			After nextInt() -> If we are using any 
			*/
		
		//Scneario 3
		/*
		String a,b;
		Scanner sc = new Scanner(System.in);
		a = sc.next();
	    int e = sc.nextInt();
		b = sc.nextLine();
	    
		System.out.println(a);
		System.out.println(b);
		System.out.println(e);
		
		Input:
			Hi
			2
		Output
			Hi

			2
			
			Explanation:
				Here if we use next() if it is only one word then whenever we are trying to collecting then we should use nextLine() before reading the value.
			*/

		//Scneario 4
				/*
				String a,b;
				Scanner sc = new Scanner(System.in);
				a = sc.next();
			    int e = sc.nextInt();
			    sc.nextLine();			    
				b = sc.nextLine();
			    
				System.out.println(a);
				System.out.println(b);
				System.out.println(e);
				
			Input:
				Hello
				2
				What are you doing>
			Output:
				Hello
				What are you doing>
				2
				*/
	
	}

}

package Java8;

import Java8.FunctionInterface.A;

public class LampdaExpression {
	@FunctionalInterface
	interface A{
		public int add(int a,int b);
		//public void show(int result);
	}
	//After Lambda
	class B {
		public static void main(String args[]){
			A obj = (a, b) -> a+b;			
			System.out.println(obj.add(5,6));
			
			C c = (a,b) -> {
				int cal = a+b;
				return cal*10;
			};
			
			System.out.print(c.calculation(5, 8));
		}
	}
	
	@FunctionalInterface
	interface C{
		public int calculation(int a, int b);
	}

}

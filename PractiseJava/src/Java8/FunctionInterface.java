package Java8;

public class FunctionInterface {
	
	@FunctionalInterface
	interface A{
		public int add(int a,int b);
		//public void show(int result);
	}
	//Before Lambda
	class B {
		public static void main(String args[]){
			A obj = new A() {
				public int add(int a, int b){
					return a+b;
				}
				public void show(int r) {
					System.out.println(r);
				}
			};
			System.out.println(obj.add(5,6));
			//obj.show(obj.add(5, 6));
		}
	}

}

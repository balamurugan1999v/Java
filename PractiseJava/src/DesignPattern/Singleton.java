package DesignPattern;

public class Singleton {
	
	public static class SingletonExample{
		
		private  int sum =0;
		public static SingletonExample classobject;
		private SingletonExample() {			
		}
		
		public static SingletonExample getInstance() {
			if( classobject == null) {
				classobject = new SingletonExample();								
			}
			return classobject;
			
		}
		
		public void setSum(int sum) {
			this.sum = sum;
		}
		
		public void print() {
			System.out.println("The sum value is :" + sum);
		}
	}
	
	public class main{
		public static void main(String args[]) {
			SingletonExample obj = SingletonExample.getInstance();
			SingletonExample obj1 = SingletonExample.getInstance();
			obj1.setSum(5);
			obj.print();
		}
	}

}

package DesignPattern;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Singleton {
	
	public static class SingletonExample implements Serializable{
		
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
		
		public Object readResolve() { // It is used to create a same object when we are using deserialization
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
		public static void main(String args[]) throws IOException, ClassNotFoundException {
			SingletonExample obj = SingletonExample.getInstance();
			SingletonExample obj1 ;
			FileOutputStream fos = new FileOutputStream(new File("C:\\Users\\ELCOT\\Desktop\\FullStack\\Java\\PractiseJava\\src\\DesignPattern\\Singleton\\file.ser"));
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);
			FileInputStream fis = new FileInputStream("C:\\Users\\ELCOT\\Desktop\\FullStack\\Java\\PractiseJava\\src\\DesignPattern\\Singleton\\file.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			obj1 = (SingletonExample) ois.readObject();
			if(obj1 == obj) {
				System.out.println("True");
			}
			obj1.setSum(5);
			obj.print();
		}
	}

}

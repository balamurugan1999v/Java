package Basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TransientKeyword implements Serializable{
	transient int transVar = 30; 
	int i =10;
	int j =2;
	String str = "Hello";
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileOutputStream fos = new FileOutputStream(new File("C:\\Users\\ELCOT\\Desktop\\FullStack\\Java\\PractiseJava\\src\\Basic\\serialize.txt"));
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		TransientKeyword obj = new TransientKeyword();
		oos.writeObject(obj);
		FileInputStream fis = new FileInputStream(new File("C:\\Users\\ELCOT\\Desktop\\FullStack\\Java\\PractiseJava\\src\\Basic\\serialize.txt"));
		ObjectInputStream ois = new ObjectInputStream(fis);
		TransientKeyword obj1 = (TransientKeyword) ois.readObject();
		System.out.println(obj1.i);
		System.out.println(obj1.j);
		System.out.println(obj1.transVar);
		System.out.println(obj1.str);
	}

}

package Basic;

import Basic.Helper.*;

public class CallByValue {

	    public static void swap(Box a, Box b) {
	        Box temp = a;
	        a = b;
	        b = temp;
	        b.value =28;
	        // Swapped references locally
	    }

	    public static void main(String[] args) {
	        Box box1 = new Box(10);
	        Box box2 = new Box(20);

	        swap(box1, box2);

	        System.out.println("box1: " + box1.value); // Output: 10
	        System.out.println("box2: " + box2.value); // Output: 20
	    }
	}

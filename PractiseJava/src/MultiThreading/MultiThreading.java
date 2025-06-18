package MultiThreading;

public class MultiThreading extends Thread {
	
	public void run() {
		System.out.println("Run: 1 " + System.currentTimeMillis());
		System.out.println("Run: 1 ");
		System.out.println("Run: 1 " + System.currentTimeMillis());
		try {
			Thread.sleep(100);
			System.out.println("Run: 2 " + System.currentTimeMillis());
			System.out.println("Run: 2 ");
			System.out.println("Run: 2 " + System.currentTimeMillis());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		MultiThreading obj = new MultiThreading();
		obj.start();
		System.out.println("Main:1 "+System.currentTimeMillis());
		System.out.println("Main:1 ");
		System.out.println("Main:1 "+System.currentTimeMillis());
		Thread.sleep(100);
		System.out.println("Main:2 "+System.currentTimeMillis());
		System.out.println("Main:2 ");
		System.out.println("Main:2 "+System.currentTimeMillis());
	}

}

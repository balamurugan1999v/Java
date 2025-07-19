package MultiThreading;

public class ThreadingInterface implements Runnable{

	public static void main(String[] args) {
		ThreadingInterface obj = new ThreadingInterface();
		obj.run();
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Executes");
		
	}

}

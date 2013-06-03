package threads;

public class ThreadMain {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1 = new Thread(new Sleeper());
		
		t1.start();
		
	}

}

package beats;

public class BeatsMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t1 = new Thread(new HiHat());
		Thread t2 = new Thread(new Snare());

		t1.start();
		t2.start();

	}

}

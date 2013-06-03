package beats;

public class Snare implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 8; i++) {

			try {
				Thread.sleep(400);
				System.out.println("KA ");
				
			} catch (Exception e) {

			}
		}

	}

}

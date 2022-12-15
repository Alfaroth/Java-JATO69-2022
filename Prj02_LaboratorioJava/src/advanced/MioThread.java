package advanced;

public class MioThread extends Thread {

	@Override
	public void run() {
		
		int iterazioni = 5;
		
		for (int i = 0; i < iterazioni; i++) {
			System.out.println("Sono il thread mioThread " + i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
				
	}

}

package advanced;

public class ProvaThread {

	public static void main(String[] args) {
		
		Thread t = new MioThread();

		t.start();	// avvia il Thread
		
		int iterazioni = 5;
		
		for (int i = 0; i < iterazioni; i++) {
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Sono il main thread " + i);
		}
				
	}
	
}

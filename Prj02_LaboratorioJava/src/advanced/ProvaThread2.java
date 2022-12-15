package advanced;

public class ProvaThread2 {

	public static void main(String[] args) {
		
		Thread t = new MioThread();
		
		t.start();
		
		int iterazioni = 5;
		
		for (int i = 0; i < iterazioni; i++) {
			try {
				Thread.sleep(2500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Sono il main thread " + i);
		}
		
	}
	
}

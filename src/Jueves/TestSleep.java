package Jueves;

public class TestSleep extends Thread {
	public void run(){
		for (int i = 1; i < 5; i++){
			try{
				Thread.sleep(1000);
				System.out.println(i);
			}catch (InterruptedException ie) {
				// TODO: handle exception
				System.out.println(ie);
			}
		}
	}
	public TestSleep() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestSleep t = new TestSleep(),
		t2 = new TestSleep();
		t.start();
		t2.start();
	}

}

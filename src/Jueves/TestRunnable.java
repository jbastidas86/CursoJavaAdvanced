package Jueves;

public class TestRunnable {

	public TestRunnable() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r1 = new Runnable() {
			
			public void run() {
				// TODO Auto-generated method stub
				show();
			}
		};
		
		Runnable r2 = new  Runnable() {
			
			public void run() {
				// TODO Auto-generated method stub
				show2();
			}
		};
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}
	
	public static void show(){
		System.out.println("tarea 1");
	}
	
	public static void show2(){
		System.out.println("tarea 2");
	}

}

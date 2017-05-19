package Jueves;

public class TestJoinNombre extends Thread {

	public void run(){
		System.out.println("Corriendo");
	}
		
	public TestJoinNombre() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestJoinNombre t1 = new TestJoinNombre(),
						t2 = new TestJoinNombre(),
						t3 = new TestJoinNombre();
		
		System.out.println("El nombre del hilo 1: " + t1.getName());
		System.out.println("El nombre del hilo 2: " + t2.getName());
		System.out.println("El nombre del hilo 3: " + t3.getName());
		
		t1.start();
		t2.start();
		t3.start();
		
		try{
			t1.join();
		}catch (InterruptedException ie) {
			// TODO: handle exception
			System.out.println(ie.getMessage());
			ie.printStackTrace();
		}
		t1.setName("Hilo A");
		t2.setName("Hilo B");
		t3.setName("Hilo C");
		
		System.out.println("Nuevo nombre del hilo 1: " + t1.getName());
		System.out.println("Nuevo nombre del hilo 2: " + t2.getName());
		System.out.println("Nuevo nombre del hilo 3: " + t3.getName());
		
	}

}

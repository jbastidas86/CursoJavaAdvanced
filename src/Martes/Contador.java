package Martes;

public class Contador {
	static int count = 0;
	public Contador() {
		// TODO Auto-generated constructor stub
		count ++;
		System.out.print(count);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contador c1 = new Contador();
		Contador c2 = new Contador();
		Contador c3 = new Contador();
	}

}

package Martes;

public class Casa {

	public Casa() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Papa p1 = new Papa();
		p1.Caminar();
		p1.Comer();
		p1.Dormir();
		Abuelo p2 = new Abuelo();
		p2.Caminar();
		Abuelo p3 = new Abuelo(false, "Juan");
		p3.Caminar();
		p3.Jugar();
		p3.Dormir();
		Hijo p4 = new Hijo();
		p4.Caminar();
		p4.Jugar();
		Hijo p5 = new Hijo(false);
		p5.Caminar();
	}

}

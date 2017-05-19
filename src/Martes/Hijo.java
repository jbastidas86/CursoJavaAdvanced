package Martes;

public class Hijo extends Papa {
	boolean bAndadera = true;
	public Hijo() {
		// TODO Auto-generated constructor stub
	}
	
	public Hijo(boolean bAndadera) {
		// TODO Auto-generated constructor stub
		this.bAndadera = bAndadera;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void Caminar() {
		// TODO Auto-generated method stub
		if (bAndadera)
			System.out.println("Camina con andadera");
		else
			System.out.println("Camina SIN andadera");
			
	}

	public void Trabajar() {
		// TODO Auto-generated method stub
		System.out.println("Camina SIN baston");
	}

	public void Jugar() {
		// TODO Auto-generated method stub
		System.out.println("juega a su PS4");
	}

	public void Dormir() {
		// TODO Auto-generated method stub
		System.out.println("Se va a la cama");
	}

	public void Comer() {
		// TODO Auto-generated method stub
		System.out.println("Se sienta a comer");
	}
}

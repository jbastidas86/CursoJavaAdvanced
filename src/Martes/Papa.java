package Martes;

public class Papa extends Abuelo implements Acciones {

	public Papa() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Papa p1 = new Papa();
		p1.Caminar();
		Abuelo p2 = new Abuelo();
		p2.Caminar();
		Abuelo p3 = new Abuelo(false);
		p3.Caminar();
		
		Hijo p4 = new Hijo();
		p4.Caminar();*/
	}

	public void Caminar() {
		// TODO Auto-generated method stub
		System.out.println("Papa Camina normal");
		
			
	}

	public void Trabajar() {
		// TODO Auto-generated method stub
		System.out.println("Papa Trabaja en la Coppel");
	}

	public void Jugar() {
		// TODO Auto-generated method stub
		System.out.println("Papa Juega");
	}

	public void Dormir() {
		// TODO Auto-generated method stub
		System.out.println("PAPA Se va a la cama");
	}

	public void Comer() {
		// TODO Auto-generated method stub
		System.out.println("Papa Se sienta a comer");
	}
}

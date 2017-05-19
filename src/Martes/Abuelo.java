package Martes;


public class Abuelo extends persona implements Acciones {
	boolean bBaston = true;

	public Abuelo() {
		this.nombre = "Pedro";
		// TODO Auto-generated constructor stub
		
	}
	
	public Abuelo(boolean baston, String nombre) {
		// TODO Auto-generated constructor stub
		bBaston = baston;
		this.nombre = nombre;
	}

	/**
	 * @param args
	 */
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}*/

	public void Caminar() {
		// TODO Auto-generated method stub
		if (bBaston)
			System.out.println( this.nombre + " Abuelo Camina con baston");
		else
			System.out.println(this.nombre +" Abuelo Camina SIN baston");
			
	}

	public void Trabajar() {
		// TODO Auto-generated method stub
		System.out.println("Abuelo Camina SIN baston");
	}

	public void Jugar() {
		// TODO Auto-generated method stub
		System.out.println("Abuelo Juega ajedrez");
	}

	public void Dormir() {
		// TODO Auto-generated method stub
		System.out.println("Abuelo Se va a la cama");
	}

	public void Comer() {
		// TODO Auto-generated method stub
		System.out.println(this.nombre + " Se sienta a comer");
	}
	
	
}

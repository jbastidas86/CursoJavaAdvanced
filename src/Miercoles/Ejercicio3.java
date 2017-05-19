package Miercoles;
/*
 	Abstract
 		tiene metodos abstractos y no abstractos.
 		Usa la palabra reservada abstract.
 		Puede proveer la implementación de una interface
 		No soporta la herencia multiple.
 		Puede tener variables estaticas, finales, no finales y no estaticas.
 		
 	Interfaz
 		Solo puede contener los metodos abstractos y en Java 8 tiene metodos default
 		y estaticos.
 		Soporta la herencia multiple
 		Solo tiene variables estaticas y finales.
 		No puede proveer la implementacion de una clase abstracta
 		Usa la palabra reservada interface.
*/
interface iBanco{
	void verInteres();
}

class Bancoppel3 implements iBanco{

	public void verInteres() {
		// TODO Auto-generated method stub
		System.out.println("Se vio el interes de Bancoppel3 7%");
	}
}
class Bancomer3 implements iBanco{

	public void verInteres() {
		// TODO Auto-generated method stub
		System.out.println("Se vio el interes de Bancomer3 9%");
	}
}
class HSBC3 implements iBanco{

	public void verInteres() {
		// TODO Auto-generated method stub
		System.out.println("Se vio el interes de HSBC3 8%");
	}
}
public class Ejercicio3 {

	public Ejercicio3() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bancoppel3 coppel = new Bancoppel3();
		coppel.verInteres();
		Bancomer3 Bancomer3 = new Bancomer3();
		Bancomer3.verInteres();
		HSBC3 HSBC3 = new HSBC3();
		HSBC3.verInteres();
	}

}

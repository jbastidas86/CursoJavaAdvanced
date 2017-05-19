package Martes;

public class StudentT {
	/*
	 	This
	 	Se trata de una variable de referencia al objeto actual
	 	
	 	 Usos de la palabra reservada this
	 	 	1.- This puede ser usado para referir a la instancia de la clase actual.
	 	 	2.- This se puede utilizar para invocar el metodo de la clase actual(implicitamente).
	 		3.- This() se utiliza para invocar al constructor de la clase actual.
	 		4.- This se puede pasar como un argumento en la llamada al método.
	 		5.- This puede ser pasado como argumento en la llamada al constructor.
	 		6.- This se puede utilizar para devolver la instancia actual del método.
	 */
	
	int noControl;
	String name;
	int edad;
	public StudentT(int noControl, int edad, String name) {
		// TODO Auto-generated constructor stub
		this.noControl = noControl;
		this.name = name;
		this.edad = edad;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

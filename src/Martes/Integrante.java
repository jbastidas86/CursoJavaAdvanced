package Martes;

public class Integrante {
	/*
	 	Constructor.-
	 	Se usa para inicializar un objeto
	 	No tiene un tipo de retorno
	 	Es invocado implicitamente 
	 	el compilador de java provee
	 	un constructor por default si no 
	 	se declara uno
	 	
	 	Debe contener la misma signatura de
	 	la clase.
	 	
	 	Método.-
	 	Es usado para explcar el comportamiento de un objeto
	 	Tiene un valor de retorno
	 	Es invocado explicitamente.
	 	No lo provee el compilador ni la clase.
	 	Puede tener o no la misma signatura de la clase.
	 */
	
	int id;
	String nombre;

	public Integrante(int i,String n) {
		id = i;
		nombre = n;
	}
	public Integrante(Integrante in) {
		id = in.id;
		nombre = in.nombre;
	}
	
	public Integrante() {
	}
	
	public void display(){
		System.out.print(id + " " +nombre);
	}
	
	public static void main(String[] args){
		Integrante i1 = new Integrante(1, "antonio");
		Integrante i2 = new Integrante(i1);
		i1.display();
		i2.display();
	}
	
}

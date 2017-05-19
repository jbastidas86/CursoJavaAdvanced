package Miercoles;
/*
 	La palabra super es una variable de referencia al objeto inmediato de la clase padre.
 	
 	siempre que se crea la instacioa de la subclase, se crea una instancia de la super clase
 	implicitamente a la que se refiere por super-variable.
 	
 	Uso de la palabra reservada super
 		Super refiere a la variable de instancia del padre super invoca al metodo de la clase padre.
 		super() invoca al constructor de la clase padre.
 */
// uso para referencia inmediata de la variable de instancia super.
public class Animal4 {
	String color = "Blanco";
	public Animal4() {
		// TODO Auto-generated constructor stub
	}

	

}
class dog4 extends Animal4{
	String color = "negro";
	void imprimir(){
		System.out.println(color);
		System.out.println(super.color);
	}
}
// Super is used to invoke parent class constructor
class Animal6 {
	Animal6(){
		System.out.println("Animal is created");
	}
}
class dog6 extends Animal6{
	public dog6() {
		// TODO Auto-generated constructor stub
		super();
		System.out.println("Dog is created");
	}
}

class PruebasAnimal4{
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog4 d4 = new dog4();
		d4.imprimir();
		
		dog5 d5 = new dog5();
		d5.sample();
		
		dog6 d6 = new dog6();
	}
}
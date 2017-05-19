package Miercoles;
/*
 	Una interfaz  es un plano de una clase tiene constantes estaticas y metodos abstractos
 	Que permiten la abstraccion 
 	Solo puede contener metodos abstractos, permite la herencia múltiple, no se puede instanciar
 	como una clase abstracta
 	
 	Razones para usar una interface
 		Por interface podemos apoyar la funcionalidad de herencia multiple.
 		Se utilize para lograr el desacoplamiento.
 		Java 8: puede contener metodos predeterminados estaticos.
 * */
public class InterfazTest implements show {
	public void print(){
		System.out.println("Hola");
	}
	public InterfazTest() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfazTest a = new InterfazTest();
		a.print();
	}

}

interface show{
	void print();
}

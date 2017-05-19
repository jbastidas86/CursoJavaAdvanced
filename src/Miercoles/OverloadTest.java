package Miercoles;

public class OverloadTest {
	/*
	 	Si una clase tiene varios m�todos que tienen el mismo nombre pero diferente en 
	 	par�metros , se conoce como sobrecarga.
	 	Si tenemos que realizar una sola operaci�n, tener el mismo nombre de los m�todos
	 	aumenta la legibilidad del programa.
	 	Ventajas: Aumenta la legibilidad del programa.
	 	Diferentes maneras de sobrecargar un m�todo.
	 	Formas de sobrecargar un m�todo:
	 		Cambiando el n�mero de argumentos.
	 		Cambiando el tipo de datos.
	 */
	public OverloadTest() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(AddArguments.add(11, 23));
		System.out.println(AddArguments.add(23,14,19));
		
		System.out.println(AddType.add(23,14));
		System.out.println(AddType.add(2.5,1.3));
		
	}
}

class AddArguments{
	static int add (int a, int b){
		return a + b;
	}
	static int add (int a, int b,int c){
		return a + b + c;
	}
}

class AddType{
	static int add(int a,int b){
		return a+b;
	}
	static double add(double a, double b){
		return a+b;
	}
}
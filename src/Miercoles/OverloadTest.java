package Miercoles;

public class OverloadTest {
	/*
	 	Si una clase tiene varios métodos que tienen el mismo nombre pero diferente en 
	 	parámetros , se conoce como sobrecarga.
	 	Si tenemos que realizar una sola operación, tener el mismo nombre de los métodos
	 	aumenta la legibilidad del programa.
	 	Ventajas: Aumenta la legibilidad del programa.
	 	Diferentes maneras de sobrecargar un método.
	 	Formas de sobrecargar un método:
	 		Cambiando el número de argumentos.
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
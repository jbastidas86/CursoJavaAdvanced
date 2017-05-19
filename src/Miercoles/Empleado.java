package Miercoles;

public class Empleado {
	float salario =  4000;
	/*
	 	Ejemplo de herencia.-
	 	
	 */
	public Empleado() {
		// TODO Auto-generated constructor stub
		
		
	}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		programador p = new programador();
		System.out.println("El salario del programador es: " + p.salario);
		System.out.println("El bono es: " + p.bono);
	}

}
class programador extends Empleado{
	int bono = 10000;
}
package Miercoles;
	/*
		Si una subclase tiene el mismo m�todo que se declar� en la clase padre,
		se conoce como redefinici�n.
		
		Si la subclase proporciona la implementacion especifica del metodo que ha sido previamente
		proporcionado en su clase padre se conoce como redefinici�n del m�todo.
		
		Uso del override en java:
			Proporciona implementaciones espec�ficas a metodos heredados.
			Proporcionan los mecanismos que permiten el polimorfismo.
		Reglas de override
			Mismo nombre que la clase padre.
			Mismo par�metro que la clase padre.
			Relacionados a IS-A.
	*/
public class OverrideTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike bici = new Bike();
		bici.run();
	}
}
class Vehiculo{
	void run(){
		System.out.println("El vehiculo est� corriendo...");
	}
}
class Bike extends Vehiculo {
	void run(){
		System.out.println("La bicicleta est� corriendo...");
	}
}
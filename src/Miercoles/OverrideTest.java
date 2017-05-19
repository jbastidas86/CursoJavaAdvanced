package Miercoles;
	/*
		Si una subclase tiene el mismo método que se declaró en la clase padre,
		se conoce como redefinición.
		
		Si la subclase proporciona la implementacion especifica del metodo que ha sido previamente
		proporcionado en su clase padre se conoce como redefinición del método.
		
		Uso del override en java:
			Proporciona implementaciones específicas a metodos heredados.
			Proporcionan los mecanismos que permiten el polimorfismo.
		Reglas de override
			Mismo nombre que la clase padre.
			Mismo parámetro que la clase padre.
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
		System.out.println("El vehiculo está corriendo...");
	}
}
class Bike extends Vehiculo {
	void run(){
		System.out.println("La bicicleta está corriendo...");
	}
}
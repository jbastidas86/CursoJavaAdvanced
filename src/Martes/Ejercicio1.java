package Martes;

public class Ejercicio1 {

	public Ejercicio1() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruta f1 = new Fruta();
		Fruta f2 = new Fruta(1, "Pera", 1.55);
		Fruta f3 = new Fruta();
		f3.iniciar(2, "Naranja", .90);
		f1.mostrar();
		f2.mostrar();
		f3.mostrar();
	}

}

class Fruta{
	int sId = 0;
	String sNombreFruta = "No tengo frutas";
	double dPesoKg = 0; 
	//constructor
	public Fruta(){
		
	}
	// iniciar por constructor especifico
	public Fruta(int id, String name, double peso){
		sId = id;
		sNombreFruta =name;
		dPesoKg = peso;
	}
	
	// Variable de referencia..
	
	
	// iniciar por metodo
	public void iniciar(int id, String name, double peso){
		sId = id;
		sNombreFruta =name;
		dPesoKg = peso;
	}
	
	//Ejecutar
	public void mostrar(){
		System.out.println(sId) ;
		System.out.println(sNombreFruta) ;
		System.out.println(dPesoKg);
		System.out.println(sId + " Fruto: " + sNombreFruta + ", Peso: " + dPesoKg);
	}
}
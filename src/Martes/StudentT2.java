package Martes;

public class StudentT2 {

	public StudentT2() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Saludos s1 = new Saludos();
		s1.tambienSaluda();
	}

}

class Saludos{
	public void Saludar(){
		System.out.println("Hola");
	}
	public void tambienSaluda(){
		System.out.println("Yo tmb saludo, Hola");
	}
}
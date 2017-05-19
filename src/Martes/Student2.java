package Martes;


public class Student2 {
	/*
	 	Si se aplica la palabra reservada static a cualquier metodo, se conoce como un método 
	 	estático.
	 	
	 	Un metodo estatico solo pertener a la clase en lugar de objeto de una clase.
	 	Se puede invocar un metodo estatico sin necesidad de crear una instancia a una clase.
	 	
	 	El metodo estatico puede acceder al miembro de datos estaticos y puede cambiar el valor 
	 	del mismo.
	 	
	 */
	int noControl;
	String nombre;
	static String Instituto = "ITL";
	
	
	public Student2() {
		// TODO Auto-generated constructor stub
	}
	public Student2(int nc, String n) {
		// TODO Auto-generated constructor stub
		noControl = nc;
		nombre = n;
	}
	
	public static void change(){
		Instituto = "ITC";
	}
	
	public void display(){
		System.out.print(noControl+ " Nombre " + nombre + " " + Instituto);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2.change();
		Student2 s1 = new Student2(1, "Antonio");
		Student2 s2 = new Student2(2, "Flor");
		Student2 s3 = new Student2(3, "FierGro");
		s1.display();
		s2.display();
		s3.display();
	}

}

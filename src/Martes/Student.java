package Martes;
/*
 	La palabra reservada static es usada principalmente para la administración de memoria.
 	Se puede tener:
 		1.- Variables estaticas.
 		2.- Metodos estaticos.
 		3.- Bloques
 		4.- Clases
 	Si declaras una variable estatica puede ser usada para dos cosas, referir una propiedad en comun con
 	todos los objetos.
 	
 	La variable estatica obtiene memoria solo una vez al momento de ser cargada a la clase.
 	
 	Ventajas: 
 		vuelve tu codigo mas eficiente  (ahorras memoria)
 		
 * */
public class Student {
	int id;
	String name;
	static String universidad = "ITC";
	
	Student(int i,  String n){
		id = i;
		name = n;
	}
	
	public void dispay(){
		System.out.print(id + " "  + name + " " + universidad );
	}
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(1, "Antonio");
		Student s2 = new Student(2, "fer");
		s1.dispay();
		s2.dispay();
	}

}

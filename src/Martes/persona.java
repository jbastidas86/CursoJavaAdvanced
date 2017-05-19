package Martes;

/*
 	Objeto: Entidad del mundo real que posee tres caracteristicas: comportamiento, 
 	estado e identidad.
 	
 	Estado: Reprensenta el valor de un objeto.
 	Comportamiento: Representa la funcionalidad que posee el objeto.
 	Identidad: Un objeto es tipicamente implementadocon el valor de id no es visible para el 
 	usuario es usado internamente por la JVM, para identificar cada objetode manera unica.
 	
 	 Un objeto es una instancia de una clase.
 	 
 	 Clase: es un grupo de objetos que tienen propiedades comunes.
 	 Es una plantilla para modelar los objetos que se crean.
 	 
 	 Una clase contiene:
 	 	campos.
 	 	métodos
 	 	Construtores.
 	 	bloques.
 	 	clases anidadas e interfaces.
  */

public class persona {
	double estatura; // campo o dato o una instancia
	String nombre;
	char sexo;
	String tez;
	double peso;
	public persona(){
		
	}
	
	public persona(double estatura,String nombre,char sexo,String tez,double peso) {
		// TODO Auto-generated constructor stub
		this.estatura =  estatura;
		this.nombre =  nombre;
		this.sexo =  sexo;
		this.tez =  tez;
		this.peso =  peso;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hola Mundo");
		/*persona people =  new persona();
		System.out.println(people.id + people.name) ;
		
		Alumno people1 =  new Alumno();
		Alumno people2 =  new Alumno(002, "Enrique Peña Nieto");
		System.out.println(people1.id + people1.name) ;
		
		people1.inicializarVariables(99, "Jesus Antonio Bastidas Lopez");
		people1.mostrar();
		people2.mostrar();*/
	}
}
// Inicializar por referencia
/*class Alumno{
	int id = 1;
	String name = "Antonio"; 
	
	public void inicializarVariables (int id, String n){
		this.id = id;
		this.name = n;
	}
	
	public void mostrar(){
		System.out.println(id) ;
		System.out.println(name) ;
		System.out.println(id + name) ;
	}
	
	public Alumno() {
		
	}
	
	public Alumno(int d, String name){
		this.id = id;
		this.name = name;
	}
}*/

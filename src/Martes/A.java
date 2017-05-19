package Martes;
/*
  Existen dos restricciones principales de un método estático:
  	1) No se puede utilizar un dato no estatico o llamar directamente al método no estático.
  	2) This y Super no se pueden utilizar en un contexto estático.
 
 * */

public class A {
	static int a= 40;
	public A() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(a);
	}

}

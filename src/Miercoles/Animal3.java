package Miercoles;
/*
 	Herencia Jerarquica
 */
public class Animal3 {
	void eat(){
		System.out.println("Comiendo...");
	}
	public Animal3() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	

}
class Perro extends Animal3{
	void run(){
		System.out.println("Corriendo...");
	}
}
class Cat extends Animal3{
	void meow(){
		System.out.println("Meowing...");
	}
}
class HerenciaJerarquica{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c = new Cat();
		c.meow();
		c.eat();
	}
}
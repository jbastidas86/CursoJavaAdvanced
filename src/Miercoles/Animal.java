package Miercoles;

public class Animal {

	void eat(){
		System.out.println("Comiendo...");
	}
	public Animal() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Dog extends Animal{
	void run(){
		System.out.println("Corriendo");
	}
}
class prueba{
	public static void main(String[] args){
		Dog d = new  Dog();
		d.run();
		d.eat();
	}
}
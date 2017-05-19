package Miercoles;

public class Animal2 {
	void eat(){
		System.out.println("Eating...");
	}
	public Animal2() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	

}
class Dog2 extends Animal2{
	void run(){
		System.out.println("Running");
	}
}
class Cachorro extends Dog2{
	void drinkMilk(){
		System.out.println("Drinkin, Milk");
	}
}

class Herencia{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cachorro cachorro = new Cachorro();
		cachorro.drinkMilk();
		cachorro.run();
		cachorro.eat();		
	}
}
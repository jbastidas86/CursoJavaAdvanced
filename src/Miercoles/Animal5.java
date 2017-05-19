package Miercoles;

public class Animal5 {
	void eat(){
		System.out.println("eating...");
	}
	public Animal5() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class dog5 extends Animal5{
	void eat(){
		System.out.println("eating bread...");
	}
	
	void run(){
		System.out.println("run away...");
	}
	void takeShower(){
		System.out.println("taking shower...");
	}
	void sample(){
		eat();
		run();
		takeShower();
		super.eat();
	}
}
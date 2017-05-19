package Martes;

public class StudentT3 {

	public StudentT3() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AB ab = new AB(10);
	}

}

class AB{
	AB(){
		System.out.println("Soy un mensaje en el constructor");
	}
	
	AB(int x){
		this();
		System.out.println(x);
	}
}

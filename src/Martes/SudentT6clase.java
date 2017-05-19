package Martes;

public class SudentT6clase {

	public SudentT6clase() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AC().getAC().msg();
	}

}
class AC{
	public AC getAC(){
		return this;
	}
	
	void msg(){
		System.out.println("Hola");
	}
}
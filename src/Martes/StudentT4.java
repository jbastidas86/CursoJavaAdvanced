package Martes;

public class StudentT4 {
	
	public void Mensajito(StudentT4 est){
		System.out.println("Hola este es un mensajito");
	}
	public void Msn(){
		Mensajito(this);
	}
	public StudentT4() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentT4 s4 = new StudentT4();
		s4.Msn();
	}

}

package Martes;

public class StudentT6 {
	otroStudent obj;
	public StudentT6(otroStudent students) {
		// TODO Auto-generated constructor stub
		this.obj = students;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		otroStudent otrovar = new otroStudent();
		StudentT6 cmd = new StudentT6(otrovar);
		StudentT6 respuesta = cmd.evento(otrovar);
		
	}
	void display(){
		System.out.println(obj.id);
	}
	
	public StudentT6 evento(otroStudent otrovar){
		StudentT6 s1 = new StudentT6(otrovar);
		return s1;
	}

}
class otroStudent{
	int id = 10;
	public otroStudent(){
		StudentT6 s1 = new StudentT6(this);
		s1.display();
	}
	
	
}

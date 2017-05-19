package Martes;

public class StudentT5 {
	Student1 obj;
	public StudentT5(Student1 students) {
		// TODO Auto-generated constructor stub
		this.obj = students;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s1= new Student1();
		
	}
	void display(){
		System.out.println(obj.id);
	}
}
class Student1{
	int id = 10;
	public Student1(){
		StudentT5 s1 = new StudentT5(this);
		s1.display();
	}
	
}

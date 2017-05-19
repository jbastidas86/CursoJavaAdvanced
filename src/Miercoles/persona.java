package Miercoles;

public class persona {
	int id;
	String name;
	public persona() {
		// TODO Auto-generated constructor stub
	}
	public persona(int id, String name) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Empleado2 extends persona{
	float salario;
	Empleado2(int id, String name, float salario){
		super(id, name);
		this.salario = salario;
	}
	void display(){
		System.out.println(id + " " + name + " " + salario);
	}
}
class PersonaTest{
	public static void main(String [] args) {
		// TODO Auto-generated method stub
		Empleado2 e = new Empleado2(1, "Antonio", 100000);
		e.display();
	}
}
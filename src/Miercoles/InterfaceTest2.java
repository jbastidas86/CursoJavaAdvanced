package Miercoles;

interface Drawable{
	void draw();
}
class Rectangle3 implements Drawable{
	public void draw(){
		System.out.println("Drawing a Rectangle");
	}
}
class Circle3 implements Drawable{
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing a circle");
	}
}
public class InterfaceTest2 {

	public InterfaceTest2() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawable d = new Circle3();
		d.draw();
		Drawable d1 = new Rectangle3();
		d1.draw();

	}

}

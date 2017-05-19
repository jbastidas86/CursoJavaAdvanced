package Miercoles;

import java.io.IOException;

/*
 	
 */
public class TestException {

	public TestException() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String [] args) throws Exception{
		int data = 0;
		int a[] = new int[5];
		
		//try{
		//data = 50/0;
		//a[6] = 30/4;
		
		try{
			comprobar c= new comprobar();
			c.method();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception handled");
		}
		/*}catch (NullPointerException ea) {
			// TODO: handle exception
			System.out.println("Error :" + ea.getMessage() );
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Error :" + e.getMessage() );
		}catch (ArrayIndexOutOfBoundsException ea) {
			// TODO: handle exception
			System.out.println("Error :" + ea.getMessage() );
		}*/
		//finally{
			System.out.println("Finally siempre se ejecuta, Resultado division a :" + data);
		//}
	}

}


class comprobar{
	void method() throws IOException{
		throw new IOException("Error");
	}
}
package Miercoles;

abstract class Banco2 {
	abstract float rangoDeInteres();
	
	public Banco2() {
		// TODO Auto-generated constructor stub
	}

	

}

class  Bancoppel2 extends Banco2 {
	float rangoDeInteres(){
		return 7f;
	}
}

class  Bancomer2 extends Banco2 {
	float rangoDeInteres(){
		return 9f;
	}
}

class  HSBC2 extends Banco2 {
	float rangoDeInteres(){
		return 8f;
	}
}

class PruebaBanco2{
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banco2 b;
		b = new Bancoppel2();
		System.out.println("La tasa de interes: " + b.rangoDeInteres());
		
		b = new Bancomer2();
		System.out.println("La tasa de interes: " + b.rangoDeInteres());
		
		b = new HSBC2();
		System.out.println("La tasa de interes: " + b.rangoDeInteres());
	}
}
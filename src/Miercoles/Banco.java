package Miercoles;

public class Banco {
	static double interes;
	static double monto;
	public Banco() {
		// TODO Auto-generated constructor stub
	}
	
	public Banco(double interes,double monto) {
		// TODO Auto-generated constructor stub
		this.interes = interes;
		this.monto = monto;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BanCoppel coppel = new BanCoppel();
		coppel.CalcularInteres(1000);
		Bancomer Bancomer = new Bancomer();
		Bancomer.CalcularInteres(50000);
		HSBC HSBC = new HSBC();
		HSBC.CalcularInteres(1999000);
	}
	
	public static double CalcularInteres(){
		System.out.println("El interes " + interes);
		System.out.println("El monto " +monto);
		return (interes * monto)/100;
	}
}

class BanCoppel extends Banco{
	void CalcularInteres(double monto){
		Banco.interes = 7;
		Banco.monto = monto;
		System.out.println(Banco.CalcularInteres());
	}
}

class Bancomer extends Banco{
	void CalcularInteres(double monto){
		Banco.interes = 9;
		Banco.monto = monto;
		System.out.println(Banco.CalcularInteres());
	}
}

class HSBC extends Banco{
	void CalcularInteres(double monto){
		Banco.interes = 8;
		Banco.monto = monto;
		System.out.println(Banco.CalcularInteres());
	}
}
package Carrera;

public class HiloLectura extends Thread {
	public void run(){
		int i = 0 ;
		while (i<= 5 ){
			try{
				Thread.sleep(6000);
				//System.out.println("Da un paso la tortuga");
				Carrera.Leer();
			}catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		i++;
		}
	}
	public HiloLectura() {
	// TODO Auto-generated constructor stub
	}

	/**
	* @param args
	*/
	public static void main(String[] args) {
	// TODO Auto-generated method stub

	}

	}

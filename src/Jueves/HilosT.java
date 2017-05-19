package Jueves;
/*
 	Paralelismo.- Multihilos en Java: Es el proceso para ejecutar muchos hilos de manera 
 	simultanea.
 	Hilo: Es un proceso ligero, unidad muy pequeña de procesamiento.
 	Concurrencia.- Multiprocesamiento y multihilo se utilizan para lograr la multitarea, en la 
 	concurrencia pueden o no ser multiprocesamiento.
 	
 	Ventaja de usar hilos:
 		1.- NO bloqueamos al usuario por que son tareas independientes y se pueden realizar
 		muchas tareas al mismo tiempo
 		2.- Podemos realizar muchas tareas al mismo tiempo.
 		3.- Los hilos al ser independientes no se afectan entre sí, en caso de ocurrir una excepcion
 		en un hilo los demas funcionan igual.
 		
 	Multitarea: Proceso de ejecución de muchas tareas, usamos la multitarea para 
 	para utilizar el cpu. La multitarea se logra de dos maneras.
 		1.- Multitarea basada en proceso.
 			* cada proceso tiene su propia direccion en memoria,
 			* es decir, cada proceso asigna una area separada de memoria.
 			* El procso es pesado.
 			* El costo de la comunicación entre procesos es alto.
 			* cambiar de un proceso a otro requiere tiempo para guardar
 			* y cargar registros, mapas de memoria, listas de actua
 		2.- Multitarea basa en hilos (multihilos).
 			* Los hilos comparten los mismo espacios en memoria para direcciones.
 			* El hilo es ligero.
 			* El costo de comunicacion entre hilos es bajo.
 			* 
 		Un hilo es un subproceso ligero, es independiente, si se produce una excepcion
 		en un hilo no afecta a los demas hilos y comparten un área de memoria en comun.
 		
 		Ciclo de vida de un hilo:
 			1.- New: El hilo esta en este estado, si se crea una instancia de la clase Thread
 			pero antes de la invocacion del metodo start().
 			2.- Runnable: El hilo esta en este estado, despues de la invocación del metodo start(), 
 			pero  el thread Scheduler(Administrador de hilos) no lo ha seleccionado.
 			3.- Running: El hilo esta aqui cuando el Thread Sheduler lo ha seleccionado.
 			4.- Non-Runnable (Blocked): Es el estado cuando el hilo activo sin embargo no es apto 
 			para ejecutarse.
 			5.- Terminated: Es el estado cuando ha finalizado o muerto, cualdo sale del metodo run().
 			
 			Las formas de crear un hilo:
 			 1.- extender de la clase Thread.
 			 2.- Al implementar la interface Runnable.
 			 
 			Clase Thread
 			Proporciona los constructores y metodos para crear y realizar operaciones en un hilo. La 
 			clase Thread extiend de la clase object e implementa la interface Runnable.
 				Constructores de la clase Thread
 				Thread()
 				Thread(Sring name)
 				Thread(Runnable r)
 				Thread(Runnable r,Sring name)
 				
 			Runnable 
 				La interfaz Runnable debe ser implementada por cualquier clase cuyas instancias 
 				esten destinadas a ser ejecutadas por un hilo.
 				La interfaz Runnable tiene un solo método denominado run()
 				public void run():  Es usado para realizar las operaciones de un hilo.
 				
 				
 */
public class HilosT  extends Thread{

	public void run(){
		System.out.println("Soy un hilo corriendo");
	}
	
	public HilosT() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String [] args){
		HilosT t1 = new HilosT();
		t1.start();
		
		Hilos t = new Hilos();
		Thread thread = new Thread(t);
		thread.start();
	}
}

class Hilos implements Runnable{
	public void run(){
		System.out.println("Soy un hilo corriendo interfaz Runnable");
	}
}
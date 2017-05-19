package Jueves;

public class TestHilos extends Thread {
    
    public static void estado( Thread t ){
        System.out.println("Hilo id:" +t.getId()+
            " Nombre:"+ t.getName() +
            " Prioridad:" + t.getPriority() +
            " Estado:"+t.getState()+
            " isAlive:"+t.isAlive()+ 
            " isDaemon:"+t.isDaemon()+ 
            " isInterrupted:"+ t.isInterrupted()+
            "currentThread:"+ t.currentThread() );
   }   
    
    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
        Hilos2 t = new Hilos2();
        
        Thread thread = new Thread(t); 
         
        Thread thread3 = new Thread(t);
        Thread thread2 = new Thread(t);
        
        
        estado(thread);
        estado(thread2);
        estado(thread3);
        
        thread.setName("Cpl_1");
        thread2.setName("Cpl_2");
        
        thread.setPriority(MAX_PRIORITY);
        thread3.setDaemon(true);
        
        estado(thread);
        estado(thread2);
        estado(thread3);
        
        
        thread.sleep(1000);
        thread2.yield();
        thread.start();
        
        estado(thread);
        estado(thread2);
        estado(thread3);        
        
        thread2.start();
        thread3.start();
        
        estado(thread);
        estado(thread2);        
        estado(thread3);        
        //thread3.start();
        System.out.println("Antes de clonar");	
        Hilos2 t2 = (Hilos2) t.clone();
        Thread thread4 = new Thread(t2);
        estado(thread3);
        estado(thread4);
        System.out.println("Aqui clona");
        thread4.setName("CloneCpl_1");
        estado(thread3);
        estado(thread4);
        thread4.start();
        estado(thread4);
        System.out.println("Fin clonar");
    }
}
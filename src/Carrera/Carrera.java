package Carrera;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Carrera {
	static String sNombreArchivo="C:\\testio\\"; 
	static String sArchivo="Myarchive.txt";
	static final String LINE_SEPARATOR = System.getProperty("line.separator");
	public Carrera() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    
	    System.out.println("Elige una opcion");
        System.out.println("-------------------------\n");
        System.out.println("1 - Escribir y leer");
        System.out.println("2 - Escribir");
        System.out.println("3 - Leer");
        System.out.println("4 - Salir");
        Tortuga t = new Tortuga();
		Thread	t2 = new Thread(new Liebre());
		Thread	t3 = new Thread(new HiloLectura());
		
		Scanner scanner = new Scanner(System.in);
	    int choice = scanner.nextInt();
        
        switch (choice) {
	        case 1:
	            // Perform "original number" case.
	        	t.start();
	        	t2.start();
	    		t3.start();
	    		System.out.println("Escribe y lee");
	            break;
	        case 2:
	            // Perform "encrypt number" case.
	        	t.start();
	        	t2.start();
	        	System.out.println("Solo escribe");
	            break;
	        case 3:
	            // Perform "decrypt number" case.
	        	t3.start();
	        	System.out.println("Solo Lee");
	            break;
	        case 4:
	            // Perform "quit" case.
	        	System.out.println("Sale");
	            break;
	        default:
	            // The user input an unexpected choice.
	    }
		
		
	}
	public void Escribir(String msg){
		try{
			File file = new File(sNombreArchivo+ sArchivo);
			if (!file.exists()) {
			file.createNewFile();
			}
			FileOutputStream fos = new FileOutputStream(file,true);
			msg = msg +LINE_SEPARATOR;
			fos.write(msg.getBytes());
			fos.close();
		}catch (IOException ioe) {
			// TODO: handle exception
		}
	}
	
	public static void Leer(){
		try{
			FileInputStream fis = new FileInputStream(sNombreArchivo+ sArchivo);
			BufferedInputStream bis = new BufferedInputStream(fis);
			int i;
			while((i = bis.read()) != -1 ){
				System.out.println((char)i);
			}
			bis.close();
			fis.close();
		}catch (IOException ioe) {
			// TODO: handle exception
		}
	}
}

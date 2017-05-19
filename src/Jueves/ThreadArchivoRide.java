package Jueves;
import java.io.*;

public class ThreadArchivoRide{
	static String sNombreArchivo="C:\\testio\\"; 
	static String sArchivo="Myarchive.txt"; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			FileOutputStream fos = new FileOutputStream(sNombreArchivo+ sArchivo);
			fos.write(65);
			fos.close();
			
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


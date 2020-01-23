package principal;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = null;
		File arquivo = new File("C:\\......\\textoExemplo.txt");
		
		try {
			sc = new Scanner(arquivo);
			while (sc.hasNextLine()) {
			   System.out.println(sc.nextLine());
			}
		}
		catch(IOException e) {
			System.out.println("Erro : " + e.getMessage());
		}
		finally {
		   if(sc != null) {
			   sc.close();
		   }
		}
	} 

}

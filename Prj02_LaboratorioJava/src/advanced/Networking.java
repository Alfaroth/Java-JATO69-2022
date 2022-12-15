package advanced;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;

public class Networking {

	public static void main(String[] args) {

		String sito = "http://www.mauro.bogliaccino.it/public/java/spring";

		try {
			
			URL url = new URL(sito);										// salvo il sito come URL
			InputStream input = url.openStream();							// apro uno stream dall'URL
			BufferedInputStream buffer = new BufferedInputStream(input);	// metto l'input in un buffer (contenitore temporaneo)
			PrintWriter scrittore = new PrintWriter(new File("files/sitoMau.html"));	// permette di stampare in un file
			
			while(true) {
				
				int data = buffer.read(); 	// leggo i dati dal buffer come intero
				
				if (data == -1) {			// se buffer.read() restituisce -1 significa che sono alla fine del file
					break;					// quindi interrompo il ciclo
				} else {
					System.out.print((char)data);	// altrimenti stampo il carattere con cast a char
					scrittore.print((char)data);	// stampo il carattere nel file sitoMau.html
				}
				
			}
			
			scrittore.close();	// il PrintWriter dopo le sue operazioni
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}

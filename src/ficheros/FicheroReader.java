package ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * esta clase procesa un fichero de texto que tiene líneas de texto cada Vuelta
 * del bucle lee una línea y una vez leída es procesada
 *
 * procesar una línea puede ser muchas cosas - sacar por pantalla - interpretar
 * para que forme parte de un objeto mas complejo
 *
 */

public class FicheroReader {
	public static void procesarDatos(String fichero) {

		int contador = 1;
		BufferedReader ficheroEntrada;
		try {

			// enlaza con un fichero usando las clases de Java
			ficheroEntrada = new BufferedReader(new FileReader(fichero));

			// leo la línea a ver si existe y hay algo
			String linea = ficheroEntrada.readLine();

			// mientras que las lineas tengan algo
			while (linea != null) {

				// Procesamos la línea leída
				System.out.println("["+contador+"] "+linea);
				System.out.println("*****************");
				contador++;

				// leemos otra línea
				linea = ficheroEntrada.readLine();

			}

			ficheroEntrada.close();
		} catch (IOException e) {
			System.out.println("Problemas: " + e.getMessage());
		} catch (Exception e) {
			// Otros fallos
			e.printStackTrace();
		}

	}

}

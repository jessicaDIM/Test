package fr.formation.helloinfile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteHello {

	public static void main(String[] args) {
		String path = args.length > 0 ? args[0] : "";
		File f = new File(path);
		try {
			if (f.createNewFile()) {
				FileWriter writer = new FileWriter(f);
				writer.write("Hello new file !\n");
				writer.flush();
				writer.close();
			} else {
				System.out.println("Erreur : le fichier existe d�j�.");
			}
		} catch (IOException e) {
			System.out.println("Erreur : impossible de cr�er le fichier.");
			e.printStackTrace(); // Affiche les d�tails de l'erreur de l'exception
			
		}
	}
}

package fr.formation.helloinfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadHello {
	
	public static final String SEARCH_TARGET = "yi";

	public static void main(String[] args) {
	 reader.readLine();
				while (line != null) {
					if (line.contains(ReadHello.SEARCH_TARGET)) {
						found = true;
						break;
					}
					line = reader.readLine();
				}
				if (found) {
					System.out.println("Le fichier contient bien la chaine recherchée !");
				} else {
					System.out.println("Le fichier ne contient pas la chaine recherchée...");
				}
				reader.close();
			} else {
				System.out.println("Erreur : le fichier n'existe pas "
						+ "ou l'accès en lecture n'est pas autorisé.");
			}
		} catch (IOException e) {
			System.out.println("Erreur : impossible de créer le fichier.");
		}
	}
}

package models;

import java.io.File;

//This class makes part of the design pattern STRATEGY together with class Fichier, class FichierXML, class Modele and interface
//TypeFichier.

public class FichierTxt implements TypeFichier{

	String nomFichier = "";
	private File myFile = new File("");
	
	@Override
	public String getNomFichier() {
		return nomFichier;
	}

	@Override
	public void setNomFichier(String s) {
		nomFichier = s + ".txt";
		
	}
	
	@Override
	public void setFile() {
		myFile = new File(nomFichier);
	}

}

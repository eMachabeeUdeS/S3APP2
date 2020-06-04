package models;

import java.io.File;

//This class makes part of the design pattern STRATEGY together with class Fichier, class FichierTxt, class Modele and interface
//TypeFichier.

public class FichierXML implements TypeFichier{

	String nomFichier = "";
	private File myFile = new File("");

	@Override
	public String getNomFichier() {
		return nomFichier;
	}

	@Override
	public void setNomFichier(String s) {
		nomFichier = s;
	}
	
	@Override
	public void setFile() {
		myFile = new File(nomFichier);
	}

}

package models;

import java.io.File;

public class FichierXML implements TypeFichier{

	String nomFichier = "";
	private File myFile = new File("");

	@Override
	public String getNomFichier() {
		return nomFichier;
	}

	@Override
	public void setNomFichier(String s) {
		nomFichier = s + ".xml";
	}
	
	@Override
	public void setFile() {
		myFile = new File(nomFichier);
	}

}

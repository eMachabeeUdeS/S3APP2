package models;

//This interface makes part of the design pattern STRATEGY together with class Fichier, class FichierTxt, class FichierXML and class
//Modele.

public interface TypeFichier {
	public String getNomFichier();
	public void setNomFichier(String s);
	public void setFile();
}

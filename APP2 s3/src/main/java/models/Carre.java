package models;

import javafx.scene.paint.Color;

//This class makes part of the design pattern FACTORY together with class Cercle, class Fleche, class Rectangle, class Source,
//class FormeFactoryEnergy, class FormeFactoryInversion, class FormeFactoryModel, class FormeFactoryStrategy, interface Forme and
//interface FormeFactory.
public class Carre implements Forme{
	
	private int hauteur = 0;
	private int largeur = 0;
	private Color couleur = null;
	private Color bordure = null;
	public void setHauteur(int h) {
		hauteur = h;
	}
	public void setLargeur(int l) {
		largeur = l;
	}
	public int getHauteur() {
		return hauteur;
	}
	public int getLargeur() {
		return largeur;
	}
	public Color getCouleur() {
		return couleur;
	}
	public Color getBordure() {
		return bordure;
	}
	@Override
	public void setRayon(int r) {
		return;
	}
	@Override
	public void setCouleur(Color c) {
		couleur = c;
	}
	@Override
	public void setBordure(Color c) {
		bordure = c;
		
	}
	@Override
	public int getRayon() {
		return 0;
	}

}

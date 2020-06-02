package models;

import javafx.scene.paint.Color;

public class Forme {
	private int hauteur = 0;
	private int largeur = 0;
	private int rayon = 0;
	private Color couleur = null;
	private Color bordure = null;
	public void setHauteur(int h) {
		hauteur = h;
	}
	public void setLargeur(int l) {
		largeur = l;
	}
	public void setRayon(int r) {
		rayon = r;
	}
	public void setCouleur(Color c) {
		couleur = c;
	}
	public void setBordure(Color b) {
		bordure = b;
	}
	
	public int getHauteur() {
		return hauteur;
	}
	public int getLargeur() {
		return largeur;
	}
	public int getRayon() {
		return rayon;
	}
	public Color getCouleur() {
		return couleur;
	}
	public Color getBordure() {
		return bordure;
	}
}

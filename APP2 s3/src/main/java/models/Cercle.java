package models;

import javafx.scene.paint.Color;

public class Cercle implements Forme{
	
	private Color couleur = null;
	private Color bordure = null;
	private int rayon = 0;
	public void setRayon(int r) {
		rayon = r;
	}
	public void setCouleur(Color c) {
		couleur = c;
	}
	public void setBordure(Color b) {
		bordure = b;
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
	@Override
	public void setLargeur(int l) {
		return;
	}
	@Override
	public void setHauteur(int h) {
		return;
	}
	@Override
	public int getLargeur() {
		return 0;
	}
	@Override
	public int getHauteur() {
		return 0;
	}

}

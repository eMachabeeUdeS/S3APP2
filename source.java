package models;
import javafx.scene.shape.*;
import javafx.scene.paint.Color;
import javafx.scene.control.Label;
import javafx.scene.control.Label.*;

public class source implements Forme {

	private Color couleur = null;
	private Color bordure = null;
	private int hauteur = 0;
	private int largeur = 0;
	public void setHauteur(int h) {
		hauteur = h;
	}
	public void setLargeur(int l) {
		largeur = l;
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
	public int getRayon() {
		return 0;
	}

}

package models;

import javafx.scene.paint.Color;

public class Fleche implements Forme{
	
	private Color bordure;

	@Override
	public void setRayon(int r) {
		return;
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
	public void setCouleur(Color c) {
		return;
	}

	@Override
	public void setBordure(Color c) {
		bordure = c;
	}

	@Override
	public int getRayon() {
		return 0;
	}

	@Override
	public int getLargeur() {
		return 0;
	}

	@Override
	public int getHauteur() {
		return 0;
	}

	@Override
	public Color getCouleur() {
		return null;
	}

	@Override
	public Color getBordure() {
		return bordure;
	}

}

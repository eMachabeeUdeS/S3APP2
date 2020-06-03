package models;

import javafx.scene.paint.Color;

public interface Forme {

	void setRayon(int r);
	void setLargeur(int l);
	void setHauteur(int h);
	void setCouleur(Color c);
	void setBordure(Color c);
	public int getRayon();
	public int getLargeur();
	public int getHauteur();
	public Color getCouleur();
	public Color getBordure();
}

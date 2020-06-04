package models;

import javafx.scene.paint.Color;

//This interface makes part of the design pattern FACTORY together with class Cercle, class Fleche, class Rectangle, class Source,
//class FormeFactoryEnergy, class FormeFactoryInversion, class FormeFactoryModel, class FormeFactoryStrategy, class Carre and
//interface FormeFactory.
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

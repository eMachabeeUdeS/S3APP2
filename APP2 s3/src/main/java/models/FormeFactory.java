package models;

//This interface makes part of the design pattern FACTORY together with class Cercle, class Carre, class Fleche, class Rectangle, class Source,
//class FormeFactoryEnergy, class FormeFactoryInversion, class FormeFactoryModel, class FormeFactoryStrategy and interface Forme.

public interface FormeFactory {
	public enum eForme
	{
		SOURCE,
		CERCLE,
		RECTANGLE,
		CARRE,
		FLECHE
	}
	
	public Forme GetForme(eForme forme);
}

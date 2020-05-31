package models;

public interface FormeFactory {
	public enum eForme
	{
		SOURCE,
		CERCLE,
		DEUXCARRE,
		DEUXCERCLE,
		CARREINF,
		CARRESUP,
		RECTANGLE,
		CARRE,
		RECTANGLEBARRE,
		FLECHE
	}
	
	public Forme GetForme(eForme forme);
}

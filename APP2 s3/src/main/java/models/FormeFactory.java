package models;

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

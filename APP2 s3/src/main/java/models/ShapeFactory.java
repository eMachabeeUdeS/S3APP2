package models;
import javafx.scene.shape.*;

public interface ShapeFactory {
	public enum eShape
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
	
	public Shape GetShape(eShape shape);
}

package models;

import models.ShapeFactory.eShape;
import javafx.scene.shape.*;

public class ShapeFactoryStrategy implements ShapeFactory {

	@Override
	public Shape GetShape(eShape shape)
	{
		if(shape == eShape.CERCLE)
			return new cercleStrategy();
		else if(shape == eShape.RECTANGLE)
			return new rectangleStrategy();
		else if(shape == eShape.CARRE)
			return new carreStrategy();
		else if(shape == eShape.CARREINF)
			return new carreInfStrategy();
		else if(shape == eShape.CARRESUP)
			return new carreSupStrategy();
		else if(shape == eShape.DEUXCERCLE)
			return new deuxCercleStrategy();
		else if(shape == eShape.DEUXCARRE)
			return new deuxCarreStrategy();
		else if(shape == eShape.SOURCE)
			return new source();
		else if(shape == eShape.RECTANGLEBARRE)
			return new rectangleBarreStrategy();
		else
			return null;
	}
}

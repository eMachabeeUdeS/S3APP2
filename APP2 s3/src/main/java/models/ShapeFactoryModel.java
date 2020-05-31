package models;

import models.ShapeFactory.eShape;
import javafx.scene.shape.*;

public class ShapeFactoryModel implements ShapeFactory {

	@Override
	public Shape GetShape(eShape shape)
	{
		if(shape == eShape.CERCLE)
			return new cercleModel();
		else if(shape == eShape.RECTANGLE)
			return new rectangleModel();
		else if(shape == eShape.CARRE)
			return new carreModel();
		else if(shape == eShape.CARREINF)
			return new carreInfModel();
		else if(shape == eShape.CARRESUP)
			return new carreSupModel();
		else if(shape == eShape.DEUXCERCLE)
			return new deuxCercleModel();
		else if(shape == eShape.DEUXCARRE)
			return new deuxCarreModel();
		else if(shape == eShape.SOURCE)
			return new source();
		else if(shape == eShape.RECTANGLEBARRE)
			return new rectangleBarreModel();
		else
			return null;
	}

}

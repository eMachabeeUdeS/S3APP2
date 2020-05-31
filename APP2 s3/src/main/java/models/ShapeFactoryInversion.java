package models;
import javafx.scene.shape.*;

import models.ShapeFactory.eShape;

public class ShapeFactoryInversion implements ShapeFactory{

	@Override
	public Shape GetShape(eShape shape)
	{
		if(shape == eShape.CERCLE)
			return new cercleInversion();
		else if(shape == eShape.RECTANGLE)
			return new rectangleInversion();
		else if(shape == eShape.CARRE)
			return new carreInversion();
		else if(shape == eShape.CARREINF)
			return new carreInfInversion();
		else if(shape == eShape.CARRESUP)
			return new carreSupInversion();
		else if(shape == eShape.DEUXCERCLE)
			return new deuxCercleInversion();
		else if(shape == eShape.DEUXCARRE)
			return new deuxCarreInversion();
		else if(shape == eShape.SOURCE)
			return new source();
		else if(shape == eShape.RECTANGLEBARRE)
			return new rectangleBarreInversion();
		else
			return null;
	}
}

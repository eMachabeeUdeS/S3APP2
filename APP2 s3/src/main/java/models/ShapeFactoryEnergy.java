package models;
import javafx.scene.shape.Shape;

public class ShapeFactoryEnergy implements ShapeFactory{
	
	@Override
	public Shape GetShape(eShape shape)
	{
		if(shape == eShape.CERCLE)
			return new cercleEnergy();
		else if(shape == eShape.RECTANGLE)
			return new rectangleEnergy();
		else if(shape == eShape.CARRE)
			return new carreEnergy();
		else if(shape == eShape.CARREINF)
			return new carreInfEnergy();
		else if(shape == eShape.CARRESUP)
			return new carreSupEnergy();
		else if(shape == eShape.DEUXCERCLE)
			return new deuxCercleEnergy();
		else if(shape == eShape.DEUXCARRE)
			return new deuxCarreEnergy();
		else if(shape == eShape.SOURCE)
			return new source();
		else if(shape == eShape.RECTANGLEBARRE)
			return new rectangleBarreEnergy();
		else
			return null;
	}
}
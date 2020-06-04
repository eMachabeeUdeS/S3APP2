package State;

import javafx.scene.canvas.GraphicsContext;
import models.Forme;

//This class makes part of the design pattern STATE together with class StateBlackArrow, class StateRedArrow and interface
//State.
public class StateDrawComponents implements State{

	@Override
	public String getEtat() {
		return "Etat draw components";
	}

	@Override
	public void drawComponent(GraphicsContext gc, String typeForme, double AnchorX, double AnchorY, Forme forme) {
		gc.setFill(forme.getCouleur());
		gc.setStroke(forme.getBordure());
		if(typeForme == "carre")
		{
			gc.strokeRect(AnchorX, AnchorY, forme.getHauteur(), forme.getLargeur());
			gc.fillRect(AnchorX, AnchorY, forme.getHauteur(), forme.getLargeur());
			gc.setFill(forme.getBordure());
			gc.fillOval(AnchorX-5, AnchorY+forme.getHauteur()/2-4, 10, 10);
			gc.fillOval(AnchorX+forme.getHauteur()-5, AnchorY+forme.getHauteur()/2-4, 10, 10);
		}
		else if(typeForme == "cercle")
		{
			gc.strokeOval(AnchorX, AnchorY, forme.getRayon()*2, forme.getRayon()*2);
			gc.fillOval(AnchorX, AnchorY, forme.getRayon()*2, forme.getRayon()*2);
			gc.setFill(forme.getBordure());
			gc.fillOval(AnchorX-5, AnchorY+forme.getRayon()-5, 10, 10);
			gc.fillOval(AnchorX+forme.getRayon()*2-5, AnchorY+forme.getRayon()-5, 10, 10);
		}
		else if(typeForme == "double_carre")
		{
			gc.strokeRect(AnchorX, AnchorY, forme.getHauteur(), forme.getLargeur());
			gc.fillRect(AnchorX, AnchorY, forme.getHauteur(), forme.getLargeur());
			gc.strokeRect(AnchorX+15, AnchorY+15, forme.getHauteur(), forme.getLargeur());
			gc.fillRect(AnchorX+15, AnchorY+15, forme.getHauteur(), forme.getLargeur());
			gc.setFill(forme.getBordure());
			gc.fillOval(AnchorX-5, AnchorY+forme.getHauteur()-5, 10, 10);
			gc.fillOval(AnchorX+10+forme.getHauteur(), AnchorY+forme.getHauteur()-5, 10, 10);
		}
		else if(typeForme == "double_cercle")
		{
			gc.strokeOval(AnchorX, AnchorY, forme.getRayon()*2, forme.getRayon()*2);
			gc.fillOval(AnchorX, AnchorY, forme.getRayon()*2, forme.getRayon()*2);
			gc.strokeOval(AnchorX+10, AnchorY+10, forme.getRayon()*2, forme.getRayon()*2);
			gc.fillOval(AnchorX+10, AnchorY+10, forme.getRayon()*2, forme.getRayon()*2);
			gc.setFill(forme.getBordure());
			gc.fillOval(AnchorX-5, AnchorY+forme.getRayon()-5, 10, 10);
			gc.fillOval(AnchorX+forme.getRayon()*2+5, AnchorY+forme.getRayon(), 10, 10);
		}
		else if(typeForme == "rectangle_barre")
		{
			gc.strokeRect(AnchorX, AnchorY, forme.getLargeur(), forme.getHauteur());
			gc.fillRect(AnchorX, AnchorY, forme.getLargeur(), forme.getHauteur());
			gc.strokeLine(AnchorX, AnchorY+forme.getHauteur(), AnchorX+forme.getLargeur(), AnchorY);
			gc.setFill(forme.getBordure());
			gc.fillOval(AnchorX-5, AnchorY+forme.getHauteur()/2-4, 10, 10);
			gc.fillOval(AnchorX+forme.getLargeur()-5, AnchorY+forme.getHauteur()/2-4, 10, 10);
		}
		else if(typeForme == "source")
		{
			gc.strokeOval(AnchorX, AnchorY, forme.getLargeur(), forme.getHauteur());
			gc.fillOval(AnchorX, AnchorY, forme.getLargeur(), forme.getHauteur());
			gc.strokeText("Source", AnchorX+forme.getHauteur()/2, AnchorY+forme.getHauteur()/2);
			gc.setFill(forme.getBordure());
			gc.fillOval(AnchorX-5, AnchorY+forme.getHauteur()/2-5, 10,10);
			gc.fillOval(AnchorX-5+forme.getLargeur(), AnchorY+forme.getHauteur()/2-5, 10, 10);
			gc.fillOval(AnchorX-5+forme.getLargeur()/2, AnchorY-5+forme.getHauteur(), 10, 10);
			gc.fillOval(AnchorX-5+forme.getLargeur()/2, AnchorY-5, 10, 10);
		}
		else if(typeForme == "carre_sup")
		{
			gc.strokeRect(AnchorX, AnchorY, forme.getHauteur(), forme.getLargeur());
			gc.fillRect(AnchorX, AnchorY, forme.getHauteur(), forme.getLargeur());
			gc.strokeLine(AnchorX, AnchorY, AnchorX +forme.getHauteur(), AnchorY+forme.getHauteur()/2);
			gc.strokeLine(AnchorX, AnchorY+forme.getHauteur(), AnchorX+forme.getHauteur(), AnchorY+forme.getHauteur()/2);
			gc.setFill(forme.getBordure());
			gc.fillOval(AnchorX-5, AnchorY-5, 10, 10);
			gc.fillOval(AnchorX-5, AnchorY+forme.getHauteur()-5, 10, 10);
			gc.fillOval(AnchorX+forme.getHauteur()-5, AnchorY+forme.getHauteur()/2-4, 10, 10);
		}
		else if(typeForme == "carre_inf")
		{
			gc.strokeRect(AnchorX, AnchorY, forme.getHauteur(), forme.getLargeur());
			gc.fillRect(AnchorX, AnchorY, forme.getHauteur(), forme.getLargeur());
			gc.strokeLine(AnchorX+forme.getHauteur(), AnchorY, AnchorX, AnchorY+forme.getHauteur()/2);
			gc.strokeLine(AnchorX+forme.getHauteur(), AnchorY+forme.getHauteur(), AnchorX, AnchorY+forme.getHauteur()/2);
			gc.setFill(forme.getBordure());
			gc.fillOval(AnchorX-5+forme.getHauteur(), AnchorY-5, 10, 10);
			gc.fillOval(AnchorX-5+forme.getHauteur(), AnchorY+forme.getHauteur()-5, 10, 10);
			gc.fillOval(AnchorX-5, AnchorY+forme.getHauteur()/2-4, 10, 10);
		}
		
	}

	@Override
	public void setCoordonneeYDebutFleche(double c) {
		return;
	}

	@Override
	public void setCoordonneeXDebutFleche(double c) {
		return;
	}

	@Override
	public double getCoordonneeXDebutFleche() {
		return 0;
	}

	@Override
	public double getCoordonneeYDebutFleche() {
		return 0;
	}

	@Override
	public void drawArrow(GraphicsContext gc, double AnchorX, double AnchorY) {
		return;
	}

}

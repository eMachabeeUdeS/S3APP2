package State;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import models.Forme;

public class StateRedArrow implements State{
	
	private double coordonneeXDebutFleche;
	private double coordonneeYDebutFleche;
	double angle = 0.7853982; //45 degrés en radians
	int longueur = 20;

	@Override
	public String editStatusBar() {
		return "Red arrows";
	}

	@Override
	public String getEtat() {
		return "Etat Red Arrows";
	}

	@Override
	public void drawComponent(GraphicsContext gc, String typeForme, double AnchorX, double AnchorY, Forme forme) {
		return;
	}

	@Override
	public void setCoordonneeYDebutFleche(double c) {
		coordonneeYDebutFleche = c;	
	}

	@Override
	public void setCoordonneeXDebutFleche(double c) {
		coordonneeXDebutFleche = c;
	}

	@Override
	public double getCoordonneeXDebutFleche() {
		return coordonneeXDebutFleche;
	}

	@Override
	public double getCoordonneeYDebutFleche() {
		return coordonneeYDebutFleche;
	}

	@Override
	public void drawArrow(GraphicsContext gc, double AnchorX, double AnchorY) {
		gc.setStroke(Color.RED);
		gc.strokeLine(coordonneeXDebutFleche, coordonneeYDebutFleche, AnchorX, AnchorY);
		double angleLigne = java.lang.Math.atan((AnchorY-coordonneeYDebutFleche)/(AnchorX-coordonneeXDebutFleche));
		double angleFleche1 = angleLigne + angle;
		double angleFleche2 = angleLigne - angle;
		
		if (AnchorX>=coordonneeXDebutFleche)
		{		
			gc.strokeLine(AnchorX, AnchorY, AnchorX-(longueur*Math.cos(angleFleche1)), AnchorY-(longueur*Math.sin(angleFleche1)));
			gc.strokeLine(AnchorX, AnchorY, AnchorX-(longueur*Math.cos(angleFleche2)), AnchorY-(longueur*Math.sin(angleFleche2)));
		}
		else
		{
			gc.strokeLine(AnchorX, AnchorY, AnchorX+(longueur*Math.cos(angleFleche1)), AnchorY+(longueur*Math.sin(angleFleche1)));
			gc.strokeLine(AnchorX, AnchorY, AnchorX+(longueur*Math.cos(angleFleche2)), AnchorY+(longueur*Math.sin(angleFleche2)));
		}
		return;
		
	}

}

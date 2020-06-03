package State;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import models.Forme;

public class StateBlackArrow implements State {
	
	private double coordonneeXDebutFleche;
	private double coordonneeYDebutFleche;
	double angle = 0.7853982; //45 degrés en radians
	int longueur = 20;

	@Override
	public String getEtat() {
		return "Etat Black Arrows";
	}

	@Override
	public void drawComponent(GraphicsContext gc, String typeForme, double AnchorX, double AnchorY, Forme forme) {
		return;
		
	}

	@Override
	public void drawArrow(GraphicsContext gc, double AnchorX, double AnchorY) {
		gc.setStroke(Color.BLACK);
		gc.strokeLine(coordonneeXDebutFleche, coordonneeYDebutFleche, AnchorX, AnchorY);
		double angleLigne = java.lang.Math.atan((AnchorY-coordonneeYDebutFleche)/(AnchorX-coordonneeXDebutFleche));
		double angleFleche1 = angleLigne + angle;
		double angleFleche2 = angleLigne - angle;
		
		if (AnchorX>=coordonneeXDebutFleche)
		{		
			gc.strokeLine(AnchorX, AnchorY, AnchorX-(longueur*Math.cos(angleFleche1)), AnchorY-(longueur*Math.sin(angleFleche1)));
			gc.strokeLine(AnchorX, AnchorY, AnchorX-(longueur*Math.cos(angleFleche2)), AnchorY-(longueur*Math.sin(angleFleche2)));
			gc.strokeLine(coordonneeXDebutFleche, coordonneeYDebutFleche, coordonneeXDebutFleche+(longueur*Math.cos(angleFleche1)), coordonneeYDebutFleche+(longueur*Math.sin(angleFleche1)));
			gc.strokeLine(coordonneeXDebutFleche, coordonneeYDebutFleche, coordonneeXDebutFleche+(longueur*Math.cos(angleFleche2)), coordonneeYDebutFleche+(longueur*Math.sin(angleFleche2)));
			gc.strokeLine(coordonneeXDebutFleche+(longueur*Math.cos(angleFleche1)), coordonneeYDebutFleche+(longueur*Math.sin(angleFleche1)), coordonneeXDebutFleche+(longueur*Math.cos(angleFleche2)), coordonneeYDebutFleche+(longueur*Math.sin(angleFleche2)));
			gc.strokeLine(AnchorX-(longueur*Math.cos(angleFleche1)), AnchorY-(longueur*Math.sin(angleFleche1)), AnchorX-(longueur*Math.cos(angleFleche2)), AnchorY-(longueur*Math.sin(angleFleche2)));
		}
		else
		{
			gc.strokeLine(AnchorX, AnchorY, AnchorX+(longueur*Math.cos(angleFleche1)), AnchorY+(longueur*Math.sin(angleFleche1)));
			gc.strokeLine(AnchorX, AnchorY, AnchorX+(longueur*Math.cos(angleFleche2)), AnchorY+(longueur*Math.sin(angleFleche2)));
			gc.strokeLine(coordonneeXDebutFleche, coordonneeYDebutFleche, coordonneeXDebutFleche-(longueur*Math.cos(angleFleche1)), coordonneeYDebutFleche-(longueur*Math.sin(angleFleche1)));
			gc.strokeLine(coordonneeXDebutFleche, coordonneeYDebutFleche, coordonneeXDebutFleche-(longueur*Math.cos(angleFleche2)), coordonneeYDebutFleche-(longueur*Math.sin(angleFleche2)));
			gc.strokeLine(coordonneeXDebutFleche-(longueur*Math.cos(angleFleche1)), coordonneeYDebutFleche-(longueur*Math.sin(angleFleche1)), coordonneeXDebutFleche-(longueur*Math.cos(angleFleche2)), coordonneeYDebutFleche-(longueur*Math.sin(angleFleche2)));
			gc.strokeLine(AnchorX+(longueur*Math.cos(angleFleche1)), AnchorY+(longueur*Math.sin(angleFleche1)), AnchorX+(longueur*Math.cos(angleFleche2)), AnchorY+(longueur*Math.sin(angleFleche2)));
		}
		return;
	}

	public double getCoordonneeXDebutFleche() {
		return coordonneeXDebutFleche;
	}

	public void setCoordonneeXDebutFleche(double c) {
		coordonneeXDebutFleche = c;
	}

	public double getCoordonneeYDebutFleche() {
		return coordonneeYDebutFleche;
	}

	public void setCoordonneeYDebutFleche(double c) {
		coordonneeYDebutFleche = c;
	}
}

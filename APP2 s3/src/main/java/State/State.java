package State;

import javafx.scene.canvas.GraphicsContext;
import models.Forme;

//This interface makes part of the design pattern STATE together with class StateBlackArrow, class StateDrawComponents and class
//StateRedArrow.

public interface State {
	
	public String getEtat();
	public void drawComponent(GraphicsContext gc, String typeForme, double AnchorX, double AnchorY, Forme forme);
	public void drawArrow(GraphicsContext gc, double AnchorX, double AnchorY);
	public void setCoordonneeYDebutFleche(double c);
	public void setCoordonneeXDebutFleche(double c);
	public double getCoordonneeXDebutFleche();
	public double getCoordonneeYDebutFleche();
}

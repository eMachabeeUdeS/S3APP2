package Controllers;

import Controllers.Ressources_Controllers.*;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public interface Commande {
	public void execute(InfosAjoutRetrait info, Canvas leCanvas, GraphicsContext aGC);
}

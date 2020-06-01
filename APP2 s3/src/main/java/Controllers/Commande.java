package Controllers;

import models.Forme;

import java.util.Deque;

import Controllers.Ressources_Controllers.*;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public interface Commande {
	public void execute(InfosAjoutRetrait info, Canvas leCanvas, GraphicsContext aGC);
}

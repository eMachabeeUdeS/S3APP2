package Controllers;

import java.util.Deque;

import Controllers.Ressources_Controllers.InfosAjoutRetrait;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class CommandeRetirer implements Commande{

	@Override
	public void execute(InfosAjoutRetrait info, Canvas leCanvas, GraphicsContext aGC) {
		aGC = leCanvas.getGraphicsContext2D();		
		aGC.setFill(Color.LIGHTGREY);
		aGC.setStroke(Color.LIGHTGREY);
		if(info.getTypeForme() == "carre")
		{
			aGC.strokeRect(info.getX(), info.getY(), info.getForme().getHauteur(), info.getForme().getLargeur());
			aGC.fillRect(info.getX(), info.getY(), info.getForme().getHauteur(), info.getForme().getLargeur());
		}
		else if(info.getTypeForme() == "cercle")
		{
			aGC.strokeOval(info.getX(), info.getY(), info.getForme().getRayon(), info.getForme().getRayon());
			aGC.fillOval(info.getX(), info.getY(), info.getForme().getRayon(), info.getForme().getRayon());
		}
		else if(info.getTypeForme() == "double_carre")
		{
			aGC.strokeRect(info.getX(), info.getY(), info.getForme().getHauteur(), info.getForme().getLargeur());
			aGC.fillRect(info.getX(), info.getY(), info.getForme().getHauteur(), info.getForme().getLargeur());
			aGC.strokeRect(info.getX()+15, info.getY()+15, info.getForme().getHauteur(), info.getForme().getLargeur());
			aGC.fillRect(info.getX()+15, info.getY()+15, info.getForme().getHauteur(), info.getForme().getLargeur());
		}
		else if(info.getTypeForme() == "double_cercle")
		{
			aGC.strokeOval(info.getX(), info.getY(), info.getForme().getRayon(), info.getForme().getRayon());
			aGC.fillOval(info.getX(), info.getY(), info.getForme().getRayon(), info.getForme().getRayon());
			aGC.strokeOval(info.getX()+10, info.getY()+10, info.getForme().getRayon(), info.getForme().getRayon());
			aGC.fillOval(info.getX()+10, info.getY()+10, info.getForme().getRayon(), info.getForme().getRayon());
		}
		else if(info.getTypeForme() == "rectangle_barre")
		{
			aGC.strokeRect(info.getX(), info.getY(), info.getForme().getLargeur(), info.getForme().getHauteur());
			aGC.fillRect(info.getX(), info.getY(), info.getForme().getLargeur(), info.getForme().getHauteur());
			aGC.strokeLine(info.getX(), info.getY()+info.getForme().getHauteur(), info.getX()+info.getForme().getLargeur(), info.getY());
		}
		else if(info.getTypeForme() == "source")
		{
			aGC.strokeOval(info.getX(), info.getY(), info.getForme().getLargeur(), info.getForme().getHauteur());
			aGC.fillOval(info.getX(), info.getY(), info.getForme().getLargeur(), info.getForme().getHauteur());
			aGC.strokeText("Source", info.getX()+info.getForme().getHauteur()/2, info.getY()+info.getForme().getHauteur()/2);
		}
		else if(info.getTypeForme() == "carre_sup")
		{
			aGC.strokeRect(info.getX(), info.getY(), info.getForme().getHauteur(), info.getForme().getLargeur());
			aGC.fillRect(info.getX(), info.getY(), info.getForme().getHauteur(), info.getForme().getLargeur());
			aGC.strokeLine(info.getX(), info.getY(), info.getX()+info.getForme().getHauteur(), info.getY()+info.getForme().getHauteur()/2);
			aGC.strokeLine(info.getX(), info.getY()+info.getForme().getHauteur(), info.getX()+info.getForme().getHauteur(), info.getY()+info.getForme().getHauteur()/2);
		}
		else if(info.getTypeForme() == "carre_inf")
		{
			aGC.strokeRect(info.getX(), info.getY(), info.getForme().getHauteur(), info.getForme().getLargeur());
			aGC.fillRect(info.getX(), info.getY(), info.getForme().getHauteur(), info.getForme().getLargeur());
			aGC.strokeLine(info.getX()+info.getForme().getHauteur(), info.getY(), info.getX(), info.getY()+info.getForme().getHauteur()/2);
			aGC.strokeLine(info.getX()+info.getForme().getHauteur(), info.getY()+info.getForme().getHauteur(), info.getX(), info.getY()+info.getForme().getHauteur()/2);
		}	
		
	}
}

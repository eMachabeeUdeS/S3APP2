package Controllers;

import java.util.Deque;

import Controllers.Ressources_Controllers.InfosAjoutRetrait;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class CommandeRetirer implements Commande{
	
	double angle = 0.785398; //45 deg en rad
	double longueur = 20;

	@Override
	public void execute(InfosAjoutRetrait info, Canvas leCanvas, GraphicsContext aGC) {
		aGC = leCanvas.getGraphicsContext2D();		
		aGC.setFill(Color.WHITE);
		if(info.getTypeForme() == "carre")
		{
			aGC.fillRect(info.getX()-1, info.getY()-1, info.getForme().getHauteur()+2, info.getForme().getLargeur()+2);
		}
		else if(info.getTypeForme() == "cercle")
		{
			aGC.fillOval(info.getX()-1, info.getY()-1, info.getForme().getRayon()+2, info.getForme().getRayon()+2);
		}
		else if(info.getTypeForme() == "double_carre")
		{
			aGC.fillRect(info.getX()-1, info.getY()-1, info.getForme().getHauteur()+2, info.getForme().getLargeur()+2);
			aGC.fillRect(info.getX()+14, info.getY()+14, info.getForme().getHauteur()+2, info.getForme().getLargeur()+2);
		}
		else if(info.getTypeForme() == "double_cercle")
		{
			aGC.fillOval(info.getX()-1, info.getY()-1, info.getForme().getRayon()+2, info.getForme().getRayon()+2);
			aGC.fillOval(info.getX()+9, info.getY()+9, info.getForme().getRayon()+2, info.getForme().getRayon()+2);
		}
		else if(info.getTypeForme() == "rectangle_barre")
		{
			aGC.fillRect(info.getX()-1, info.getY()-1, info.getForme().getLargeur()+2, info.getForme().getHauteur()+2);
		}
		else if(info.getTypeForme() == "source")
		{
			aGC.fillOval(info.getX()-1, info.getY()-1, info.getForme().getLargeur()+2, info.getForme().getHauteur()+2);
		}
		else if(info.getTypeForme() == "carre_sup")
		{
			aGC.fillRect(info.getX()-1, info.getY()-1, info.getForme().getHauteur()+2, info.getForme().getLargeur()+2);
		}
		else if(info.getTypeForme() == "carre_inf")
		{
			aGC.fillRect(info.getX()-1, info.getY()-1, info.getForme().getHauteur()+2, info.getForme().getLargeur()+2);
		}	
		else if(info.getTypeForme() == "fleche")
		{
			aGC.setStroke(Color.WHITE);
			aGC.strokeLine(info.getX(), info.getY(), info.getX2(), info.getY2());
			double angleLigne = java.lang.Math.atan((info.getY2()-info.getY())/(info.getX2()-info.getX()));
			double angleFleche1 = angleLigne + angle;
			double angleFleche2 = angleLigne - angle;
			
			if (info.getX2()>=info.getX())
			{
				aGC.strokeLine(info.getX2(), info.getY2(), info.getX2()-(longueur*Math.cos(angleFleche1)), info.getY2()-(longueur*Math.sin(angleFleche1)));
				aGC.strokeLine(info.getX2(), info.getY2(), info.getX2()-(longueur*Math.cos(angleFleche2)), info.getY2()-(longueur*Math.sin(angleFleche2)));
			}
			else
			{
				aGC.strokeLine(info.getX2(), info.getY2(), info.getX2()+(longueur*Math.cos(angleFleche1)), info.getY2()+(longueur*Math.sin(angleFleche1)));
				aGC.strokeLine(info.getX2(), info.getY2(), info.getX2()+(longueur*Math.cos(angleFleche2)), info.getY2()+(longueur*Math.sin(angleFleche2)));
			}
		}
		
	}
}

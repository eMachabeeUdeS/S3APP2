package Controllers;
import java.util.Deque;

import Controllers.Ressources_Controllers.InfosAjoutRetrait;
import javafx.scene.canvas.*;
import javafx.scene.paint.Color;
import models.Forme;
import models.FormeFactory.eForme;

import java.util.*;

public class CommandeAjouter implements Commande {
	
	double angle = 0.785398; //45 deg en rad
	double longueur = 20;

	@Override
	public void execute(InfosAjoutRetrait info, Canvas leCanvas, GraphicsContext aGC) {
		aGC = leCanvas.getGraphicsContext2D();		
		aGC.setFill(info.getForme().getCouleur());
		aGC.setStroke(info.getForme().getBordure());
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
		else if(info.getTypeForme() == "fleche")
		{
			aGC.setStroke(Color.BLACK);
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

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
		
	}
}

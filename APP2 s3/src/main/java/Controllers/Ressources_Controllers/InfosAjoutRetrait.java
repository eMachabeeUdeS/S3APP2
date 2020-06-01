package Controllers.Ressources_Controllers;

import models.*;

public class InfosAjoutRetrait {
	String typeForme;
	Forme forme;
	double positionX;
	double positionY;
	
	public InfosAjoutRetrait(String s, Forme f, double x, double y){
		this.typeForme = s;
		this.forme = f;
		this.positionX = x;
		this.positionY = y;
	}
	
	public String getTypeForme() {
		return typeForme;
	}
	
	public Forme getForme() {
		return forme;
	}
	
	public double getX() {
		return positionX;
	}
	
	public double getY() {
		return positionY;
	}
	
}

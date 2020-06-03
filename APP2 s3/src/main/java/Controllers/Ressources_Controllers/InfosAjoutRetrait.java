package Controllers.Ressources_Controllers;

import models.*;

public class InfosAjoutRetrait {
	String typeForme;
	Forme forme;
	double positionX;
	double positionY;
	double positionX2;
	double positionY2;
	
	public InfosAjoutRetrait(String s, Forme f, double x, double y, double x2, double y2) {
		this.typeForme = s;
		this.forme = f;
		this.positionX = x;
		this.positionY = y;
		this.positionX2 = x2;
		this.positionY2 = y2;
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
	
	public double getX2() {
		return positionX2;
	}
	
	public double getY2() {
		return positionY2;
	}
}

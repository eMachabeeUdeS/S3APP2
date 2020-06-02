package models;

public class Modele {
	
	private String typeForme;
	private String couleursForme;
	private double anchorX1;
	private double anchorY1;
	private double anchorX2;
	private double anchorY2;
	
	public String getTypeForme() {
		return typeForme;
	}
	
	public double getAnchorX1() {
		return anchorX1;
	}
	
	public double getAnchorY1() {
		return anchorY1;
	}
	
	public double getAnchorX2() {
		return anchorX2;
	}
	
	public double getAnchorY2() {
		return anchorY2;
	}
	
	public String getCouleursForme() {
		return couleursForme;
	}
	
	public void setTypeForme(String t) {
		typeForme = t;
	}
	
	public void setAnchorX1(double x) {
		anchorX1 = x;
	}
	
	public void setAnchorY1(double y) {
		anchorY1 = y;
	}
	
	public void setAnchorX2(double x) {
		anchorX2 = x;
	}
	
	public void setAnchorY2(double y) {
		anchorY2 = y;
	}
	
	public void setCouleursForme(String c) {
		couleursForme = c;
	}
}

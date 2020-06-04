package models;

import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.io.FileReader;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

//This class makes part of the design pattern STRATEGY together with class FichierTxt, class FichierXML, class Modele and interface
//TypeFichier.

public class Fichier{
	
	private TypeFichier typeFichier = new FichierXML();
	
	public void ecrireFichier(Deque<Modele> stack) {
		try {
			Deque<Modele> copyStack = new ArrayDeque<Modele>();	
			copyStack.addAll(stack);

			FileWriter myFileWriter = new FileWriter(typeFichier.getNomFichier());
			while(!copyStack.isEmpty()) {
				myFileWriter.write(copyStack.getFirst().getTypeForme() + " " + copyStack.getFirst().getAnchorX1() + " " + copyStack.getFirst().getAnchorY1() + " " +
						copyStack.getFirst().getAnchorX2() + " " + copyStack.getFirst().getAnchorY2() + " " + copyStack.getFirst().getCouleursForme() + "\n");
				copyStack.pop();
			}
			myFileWriter.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	public Deque<Modele> lireFichier(GraphicsContext GC, double CanvasWidth, double CanvasHeight) {
		Deque<Modele> stack = new ArrayDeque<Modele>();
		try {
			System.out.println("test");
			BufferedReader myFileReader = new BufferedReader(new FileReader(typeFichier.getNomFichier()));
			String line;
			while((line = myFileReader.readLine()) != null) {
				String[] words = line.split(" ");
				Modele m = new Modele();
				m.setTypeForme(words[0]);
				m.setAnchorX1(Double.parseDouble(words[1]));
				m.setAnchorY1(Double.parseDouble(words[2]));
				m.setAnchorX2(Double.parseDouble(words[3]));
				m.setAnchorY2(Double.parseDouble(words[4]));
				m.setCouleursForme(words[5]);
				
				stack.add(m);
			}
			myFileReader.close();
			
		} catch (IOException e) {
				e.printStackTrace();
			}
		GC.clearRect(0, 0, CanvasWidth, CanvasHeight);
		Deque<Modele> copyStack = new ArrayDeque<Modele>();
		copyStack.addAll(stack);
		while(!copyStack.isEmpty()) {
			if(copyStack.getFirst().getCouleursForme().equals("energy"))
			{
				GC.setFill(Color.web("#FFD700"));
				GC.setStroke(Color.web("#FF0000"));	
			}
			if(copyStack.getFirst().getTypeForme().equals("carre"))
			{
				GC.strokeRect(copyStack.getFirst().getAnchorX1(), copyStack.getFirst().getAnchorY1(), 40, 40);
				GC.fillRect(copyStack.getFirst().getAnchorX1(), copyStack.getFirst().getAnchorY1(), 40, 40);
				GC.setFill(GC.getStroke());
				GC.fillOval(copyStack.getFirst().getAnchorX1()-5, copyStack.getFirst().getAnchorY1()+40/2-4, 10, 10);
				GC.fillOval(copyStack.getFirst().getAnchorX1()+40-5, copyStack.getFirst().getAnchorY1()+40/2-4, 10, 10);
				
			}
			else if(copyStack.getFirst().getTypeForme().equals("cercle"))
			{
				GC.strokeOval(copyStack.getFirst().getAnchorX1(), copyStack.getFirst().getAnchorY1(), 40, 40);
				GC.fillOval(copyStack.getFirst().getAnchorX1(), copyStack.getFirst().getAnchorY1(), 40, 40);
				GC.setFill(GC.getStroke());
				GC.fillOval(copyStack.getFirst().getAnchorX1()-5, copyStack.getFirst().getAnchorY1()+20-5, 10, 10);
				GC.fillOval(copyStack.getFirst().getAnchorX1()+20*2-5, copyStack.getFirst().getAnchorY1()+20-5, 10, 10);
			}
			else if(copyStack.getFirst().getTypeForme().equals("double_carre"))
			{
				GC.strokeRect(copyStack.getFirst().getAnchorX1(), copyStack.getFirst().getAnchorY1(), 40, 40);
				GC.fillRect(copyStack.getFirst().getAnchorX1(), copyStack.getFirst().getAnchorY1(), 40, 40);
				GC.strokeRect(copyStack.getFirst().getAnchorX1()+15, copyStack.getFirst().getAnchorY1()+15, 40, 40);
				GC.fillRect(copyStack.getFirst().getAnchorX1()+15, copyStack.getFirst().getAnchorY1()+15, 40, 40);
				GC.setFill(GC.getStroke());
				GC.fillOval(copyStack.getFirst().getAnchorX1()-5, copyStack.getFirst().getAnchorY1()+40-5, 10, 10);
				GC.fillOval(copyStack.getFirst().getAnchorX1()+10+40, copyStack.getFirst().getAnchorY1()+40-5, 10, 10);
			}
			else if(copyStack.getFirst().getTypeForme().equals("double_cercle"))
			{
				GC.strokeOval(copyStack.getFirst().getAnchorX1(), copyStack.getFirst().getAnchorY1(), 40, 40);
				GC.fillOval(copyStack.getFirst().getAnchorX1(), copyStack.getFirst().getAnchorY1(), 40, 40);
				GC.strokeOval(copyStack.getFirst().getAnchorX1()+10, copyStack.getFirst().getAnchorY1()+10, 40, 40);
				GC.fillOval(copyStack.getFirst().getAnchorX1()+10, copyStack.getFirst().getAnchorY1()+10, 40, 40);
				GC.setFill(GC.getStroke());
				GC.fillOval(copyStack.getFirst().getAnchorX1()-5, copyStack.getFirst().getAnchorY1()+20-5, 10, 10);
				GC.fillOval(copyStack.getFirst().getAnchorX1()+20*2+5, copyStack.getFirst().getAnchorY1()+20, 10, 10);
			
			}
			else if(copyStack.getFirst().getTypeForme().equals("rectangle_barre"))
			{
				GC.strokeRect(copyStack.getFirst().getAnchorX1(), copyStack.getFirst().getAnchorY1(), 20, 40);
				GC.fillRect(copyStack.getFirst().getAnchorX1(), copyStack.getFirst().getAnchorY1(), 20, 40);
				GC.strokeLine(copyStack.getFirst().getAnchorX1(), copyStack.getFirst().getAnchorY1()+40, copyStack.getFirst().getAnchorX1()+20, copyStack.getFirst().getAnchorY1());
				GC.setFill(GC.getStroke());
				GC.fillOval(copyStack.getFirst().getAnchorX1()-5, copyStack.getFirst().getAnchorY1()+40/2-4, 10, 10);
				GC.fillOval(copyStack.getFirst().getAnchorX1()+20-5, copyStack.getFirst().getAnchorY1()+40/2-4, 10, 10);
			}
			else if(copyStack.getFirst().getTypeForme().equals("source"))
			{
				GC.setFill(Color.web("#98FB98"));
				GC.setStroke(Color.web("#008000"));
				GC.strokeOval(copyStack.getFirst().getAnchorX1(), copyStack.getFirst().getAnchorY1(), 60, 30);
				GC.fillOval(copyStack.getFirst().getAnchorX1(), copyStack.getFirst().getAnchorY1(), 60, 30);
				GC.strokeText("Source", copyStack.getFirst().getAnchorX1()+30, copyStack.getFirst().getAnchorY1()+10);
				GC.setFill(GC.getStroke());
				GC.fillOval(copyStack.getFirst().getAnchorX1()-5, copyStack.getFirst().getAnchorY1()+20/2-5, 10,10);
				GC.fillOval(copyStack.getFirst().getAnchorX1()-5+40, copyStack.getFirst().getAnchorY1()+20/2-5, 10, 10);
				GC.fillOval(copyStack.getFirst().getAnchorX1()-5+40/2, copyStack.getFirst().getAnchorY1()-5+20, 10, 10);
				GC.fillOval(copyStack.getFirst().getAnchorX1()-5+40/2, copyStack.getFirst().getAnchorY1()-5, 10, 10);
			}
			else if(copyStack.getFirst().getTypeForme().equals("carre_sup"))
			{
				GC.strokeRect(copyStack.getFirst().getAnchorX1(), copyStack.getFirst().getAnchorY1(), 40, 40);
				GC.fillRect(copyStack.getFirst().getAnchorX1(), copyStack.getFirst().getAnchorY1(), 40, 40);
				GC.strokeLine(copyStack.getFirst().getAnchorX1(), copyStack.getFirst().getAnchorY1(), copyStack.getFirst().getAnchorX1()+40, copyStack.getFirst().getAnchorY1()+20);
				GC.strokeLine(copyStack.getFirst().getAnchorX1(), copyStack.getFirst().getAnchorY1()+40, copyStack.getFirst().getAnchorX1()+40, copyStack.getFirst().getAnchorY1()+20);
				GC.setFill(GC.getStroke());
				GC.fillOval(copyStack.getFirst().getAnchorX1()-5, copyStack.getFirst().getAnchorY1()-5, 10, 10);
				GC.fillOval(copyStack.getFirst().getAnchorX1()-5,copyStack.getFirst().getAnchorY1()+40-5, 10, 10);
				GC.fillOval(copyStack.getFirst().getAnchorX1()+40-5, copyStack.getFirst().getAnchorY1()+40/2-4, 10, 10);
			}
			else if(copyStack.getFirst().getTypeForme().equals("carre_inf"))
			{
				GC.strokeRect(copyStack.getFirst().getAnchorX1(), copyStack.getFirst().getAnchorY1(), 40, 40);
				GC.fillRect(copyStack.getFirst().getAnchorX1(), copyStack.getFirst().getAnchorY1(), 40, 40);
				GC.strokeLine(copyStack.getFirst().getAnchorX1()+40, copyStack.getFirst().getAnchorY1(), copyStack.getFirst().getAnchorX1(), copyStack.getFirst().getAnchorY1()+20);
				GC.strokeLine(copyStack.getFirst().getAnchorX1()+40, copyStack.getFirst().getAnchorY1()+40, copyStack.getFirst().getAnchorX1(), copyStack.getFirst().getAnchorY1()+20);
				GC.setFill(GC.getStroke());
				GC.fillOval(copyStack.getFirst().getAnchorX1()-5+40, copyStack.getFirst().getAnchorY1()-5, 10, 10);
				GC.fillOval(copyStack.getFirst().getAnchorX1()-5+40, copyStack.getFirst().getAnchorY1()+40-5, 10, 10);
				GC.fillOval(copyStack.getFirst().getAnchorX1()-5, copyStack.getFirst().getAnchorY1()+40/2-4, 10, 10);
			
			}
			else if(copyStack.getFirst().getTypeForme().equals("fleche"))
			{
				GC.setStroke(Color.BLACK);
				GC.strokeLine(copyStack.getFirst().getAnchorX1(), copyStack.getFirst().getAnchorY1(), copyStack.getFirst().getAnchorX2(), copyStack.getFirst().getAnchorY2());
				GC.setFill(GC.getStroke());
			}
			copyStack.pop();
		}
		
		return stack;
	}
	
	public void setTypeFichierXML(String name) {
		typeFichier = new FichierXML();
		typeFichier.setNomFichier(name);
	}
	
	public void setTypeFichierTXT(String name) {
		typeFichier = new FichierTxt();
		typeFichier.setNomFichier(name);
	}

}

package models;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.io.FileReader;
import javafx.scene.canvas.GraphicsContext;

public class FichierXML implements Fichier {
	
	File myFile = new File("");
	
	@Override
	public void ecrireFichier(Deque<Modele> stack, String nomFichier) {
		try {
			Deque<Modele> copyStack = new ArrayDeque<Modele>();	
			copyStack.addAll(stack);

			FileWriter myFileWriter = new FileWriter(myFile);
			while(!copyStack.isEmpty()) {
				myFileWriter.write(copyStack.getFirst().getTypeForme() + " " + copyStack.getFirst().getAnchorX1() + " " + copyStack.getFirst().getAnchorY1() + " " +
						copyStack.getFirst().getAnchorX2() + " " + copyStack.getFirst().getAnchorY2() + "\n");
				copyStack.pop();
			}
			myFileWriter.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Deque<Modele> lireFichier(Deque<Modele> stack, String nomFichier, GraphicsContext GC, double CanvasWidth, double CanvasHeight) {
		try {
			BufferedReader myFileReader = new BufferedReader(new FileReader(myFile));
			String line;
			while((line = myFileReader.readLine()) != null) {
				String words[] = line.split(" ");
				Modele m = new Modele();
				m.setTypeForme(words[0]);
				m.setAnchorX1(Double.parseDouble(words[1]));
				m.setAnchorY1(Double.parseDouble(words[2]));
				m.setAnchorX2(Double.parseDouble(words[3]));
				m.setAnchorY2(Double.parseDouble(words[4]));
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
			if(copyStack.getFirst().getCouleursForme() == "energy")
			{
				
			}
			if(copyStack.getFirst().getTypeForme() == "carre")
			{
				GC.strokeRect(copyStack.getFirst().getAnchorX1(), copyStack.getFirst().getAnchorY1(), aForme.getHauteur(), aForme.getLargeur());
				GC.fillRect(copyStack.getFirst().getAnchorX1(), copyStack.getFirst().getAnchorY1(), aForme.getHauteur(), aForme.getLargeur());
			}
			else if(copyStack.getFirst().getTypeForme() == "cercle")
			{
				GC.strokeOval(copyStack.getFirst().getAnchorX1(), copyStack.getFirst().getAnchorY1(), aForme.getRayon()*2, aForme.getRayon()*2);
				GC.fillOval(copyStack.getFirst().getAnchorX1(), copyStack.getFirst().getAnchorY1(), aForme.getRayon()*2, aForme.getRayon()*2);
			}
			else if(copyStack.getFirst().getTypeForme() == "double_carre")
			{
				GC.strokeRect(copyStack.getFirst().getAnchorX1(), copyStack.getFirst().getAnchorY1(), aForme.getHauteur(), aForme.getLargeur());
				GC.fillRect(copyStack.getFirst().getAnchorX1(), copyStack.getFirst().getAnchorY1(), aForme.getHauteur(), aForme.getLargeur());
				GC.strokeRect(copyStack.getFirst().getAnchorX1()+15, copyStack.getFirst().getAnchorY1())+15, aForme.getHauteur(), aForme.getLargeur());
				GC.fillRect(copyStack.getFirst().getAnchorX1()+15, copyStack.getFirst().getAnchorY1()+15, aForme.getHauteur(), aForme.getLargeur());
			}
			else if(copyStack.getFirst().getTypeForme() == "double_cercle")
			{
				GC.strokeOval(copyStack.getFirst().getAnchorX1(), copyStack.getFirst().getAnchorY1(), aForme.getRayon()*2, aForme.getRayon()*2);
				GC.fillOval(copyStack.getFirst().getAnchorX1(), copyStack.getFirst().getAnchorY1(), aForme.getRayon()*2, aForme.getRayon()*2);
				GC.strokeOval(copyStack.getFirst().getAnchorX1()+10, copyStack.getFirst().getAnchorY1()+10, aForme.getRayon()*2, aForme.getRayon()*2);
				GC.fillOval(copyStack.getFirst().getAnchorX1()+10, copyStack.getFirst().getAnchorY1()+10, aForme.getRayon()*2, aForme.getRayon()*2);
			}
			else if(copyStack.getFirst().getTypeForme() == "rectangle_barre")
			{
				GC.strokeRect(copyStack.getFirst().getAnchorX1(), copyStack.getFirst().getAnchorY1(), aForme.getLargeur(), aForme.getHauteur());
				GC.fillRect(copyStack.getFirst().getAnchorX1(), copyStack.getFirst().getAnchorY1(), aForme.getLargeur(), aForme.getHauteur());
				GC.strokeLine(copyStack.getFirst().getAnchorX1(), copyStack.getFirst().getAnchorY1()+aForme.getHauteur(), copyStack.getFirst().getAnchorX1()+aForme.getLargeur(), event.getY());
			}
			else if(copyStack.getFirst().getTypeForme() == "source")
			{
				GC.strokeOval(copyStack.getFirst().getAnchorX1(), copyStack.getFirst().getAnchorY1(), aForme.getLargeur(), aForme.getHauteur());
				GC.fillOval(copyStack.getFirst().getAnchorX1(), copyStack.getFirst().getAnchorY1(), aForme.getLargeur(), aForme.getHauteur());
				GC.strokeText("Source", copyStack.getFirst().getAnchorX1()+aForme.getHauteur()/2, event.getY()+aForme.getHauteur()/2);
			}
			else if(copyStack.getFirst().getTypeForme() == "carre_sup")
			{
				GC.strokeRect(copyStack.getFirst().getAnchorX1(), event.getY(), aForme.getHauteur(), aForme.getLargeur());
				GC.fillRect(copyStack.getFirst().getAnchorX1(), event.getY(), aForme.getHauteur(), aForme.getLargeur());
				GC.strokeLine(copyStack.getFirst().getAnchorX1(), event.getY(), copyStack.getFirst().getAnchorX1()+aForme.getHauteur(), event.getY()+aForme.getHauteur()/2);
				GC.strokeLine(copyStack.getFirst().getAnchorX1(), event.getY()+aForme.getHauteur(), copyStack.getFirst().getAnchorX1()+aForme.getHauteur(), event.getY()+aForme.getHauteur()/2);
			}
			else if(copyStack.getFirst().getTypeForme() == "carre_inf")
			{
				GC.strokeRect(copyStack.getFirst().getAnchorX1(), event.getY(), aForme.getHauteur(), aForme.getLargeur());
				GC.fillRect(copyStack.getFirst().getAnchorX1(), event.getY(), aForme.getHauteur(), aForme.getLargeur());
				GC.strokeLine(copyStack.getFirst().getAnchorX1()+aForme.getHauteur(), event.getY(), copyStack.getFirst().getAnchorX1(), event.getY()+aForme.getHauteur()/2);
				GC.strokeLine(copyStack.getFirst().getAnchorX1()+aForme.getHauteur(), event.getY()+aForme.getHauteur(), copyStack.getFirst().getAnchorX1(), event.getY()+aForme.getHauteur()/2);
			}
			copyStack.pop();
		}
		
		return stack;
	}

	@Override
	public void nouveauFichier(String nomFichier) {
		myFile = new File(nomFichier + ".XML");
	}

}

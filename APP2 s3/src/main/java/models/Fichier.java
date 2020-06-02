package models;

import java.util.Deque;
import javafx.scene.canvas.*;

public interface Fichier {
	
	public void nouveauFichier(String nomFichier);
	public Deque<Modele> lireFichier(Deque<Modele> stack, String nomFichier, GraphicsContext GC, double CanvasWidth, double CanvasHeight);
	public void ecrireFichier(Deque<Modele> stack, String nomFichier);

}

package Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.event.*;
import Controllers.*;
import State.*;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.*;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.control.ListView;
import models.*;
import models.FormeFactory.eForme;
import javafx.scene.paint.Color;

public class gestionBoutonsToolbar {
	State etat;
	FormeFactory inversion = new FormeFactoryInversion();
	FormeFactory energy = new FormeFactoryEnergy();
	FormeFactory strategy = new FormeFactoryStrategy();
	FormeFactory model = new FormeFactoryModel();
	String typeForme;
	double coordonneeXDebutFleche;
	double coordonneeYDebutFleche;
	
	Forme aForme;
	Canvas aCanvas;
	GraphicsContext aGC;
	
	@FXML
	private Ellipse shape_source;
	
	@FXML
	private Scene topScene;
	
	@FXML
	private Canvas leCanvas;
	
	@FXML
	private Rectangle carre_energy;
	
	@FXML
	private Circle cercle_energy;
	
	@FXML
	private Circle double_cercle_energy;
	
	@FXML
	private Rectangle double_carre_energy;
	
	@FXML
	private Rectangle carre_sup_energy;
	
	@FXML
	private Rectangle carre_inf_energy;
	
	@FXML
	private Rectangle rectangle_barre_energy;
	
	@FXML
	private Button buttonPlus;
	

	
	@FXML
	void CarreEnergyDragDetected(MouseEvent event) {
		Dragboard dragboard = carre_energy.startDragAndDrop(TransferMode.ANY);
		ClipboardContent content = new ClipboardContent();
		content.putString("carre_energy");
		dragboard.setContent(content);
		aForme = energy.GetForme(eForme.CARRE);
		typeForme = "carre";
		event.consume();
	}
	
	@FXML
	void CercleEnergyDragDetected(MouseEvent event) {
		Dragboard dragboard = cercle_energy.startDragAndDrop(TransferMode.ANY);
		ClipboardContent content = new ClipboardContent();
		content.putString("cercle_energy");
		dragboard.setContent(content);
		aForme = energy.GetForme(eForme.CERCLE);
		typeForme = "cercle";
		event.consume();
	}
	
	@FXML
	void RectangleBarreEnergyDragDetected(MouseEvent event) {
		Dragboard dragboard = rectangle_barre_energy.startDragAndDrop(TransferMode.ANY);
		ClipboardContent content = new ClipboardContent();
		content.putString("rectangle_energy");
		dragboard.setContent(content);
		aForme = energy.GetForme(eForme.RECTANGLE);
		typeForme = "rectangle_barre";
		event.consume();
	}
	
	@FXML
	void deuxCerclesEnergyDragDetected(MouseEvent event) {
		Dragboard dragboard = double_cercle_energy.startDragAndDrop(TransferMode.ANY);
		ClipboardContent content = new ClipboardContent();
		content.putString("double_cercle");
		dragboard.setContent(content);
		aForme = energy.GetForme(eForme.CERCLE);
		typeForme = "double_cercle";
		event.consume();
	}
	
	@FXML
	void deuxCarresEnergyDragDetected(MouseEvent event) {
		Dragboard dragboard = double_carre_energy.startDragAndDrop(TransferMode.ANY);
		ClipboardContent content = new ClipboardContent();
		content.putString("double_carre");
		dragboard.setContent(content);
		aForme = energy.GetForme(eForme.CARRE);
		typeForme = "double_carre";
		event.consume();
	}
	
	@FXML
	void carreInfEnergyDragDetected(MouseEvent event) {
		Dragboard dragboard = carre_inf_energy.startDragAndDrop(TransferMode.ANY);
		ClipboardContent content = new ClipboardContent();
		content.putString("carre_inf");
		dragboard.setContent(content);
		aForme = energy.GetForme(eForme.CARRE);
		typeForme = "carre_inf";
		event.consume();	
	}
	
	@FXML
	void carreSupEnergyDragDetected(MouseEvent event) {
		Dragboard dragboard = carre_sup_energy.startDragAndDrop(TransferMode.ANY);
		ClipboardContent content = new ClipboardContent();
		content.putString("carre_sup");
		dragboard.setContent(content);
		aForme = energy.GetForme(eForme.CARRE);
		typeForme = "carre_sup";
		event.consume();
	}
	
	@FXML
	void sourceDragDetected(MouseEvent event) {
		Dragboard dragboard = shape_source.startDragAndDrop(TransferMode.ANY);
		ClipboardContent content = new ClipboardContent();
		content.putString("source");
		dragboard.setContent(content);
		aForme = energy.GetForme(eForme.SOURCE);
		typeForme = "source";
		event.consume();
	}
	
	@FXML
	void CanvasDragDrop(DragEvent event) {
		aGC = leCanvas.getGraphicsContext2D();		
		aGC.setFill(aForme.getCouleur());
		aGC.setStroke(aForme.getBordure());
		if(typeForme == "carre")
		{
			aGC.strokeRect(event.getX(), event.getY(), aForme.getHauteur(), aForme.getLargeur());
			aGC.fillRect(event.getX(), event.getY(), aForme.getHauteur(), aForme.getLargeur());
		}
		else if(typeForme == "cercle")
		{
			aGC.strokeOval(event.getX(), event.getY(), aForme.getRayon()*2, aForme.getRayon()*2);
			aGC.fillOval(event.getX(), event.getY(), aForme.getRayon()*2, aForme.getRayon()*2);
		}
		else if(typeForme == "double_carre")
		{
			aGC.strokeRect(event.getX(), event.getY(), aForme.getHauteur(), aForme.getLargeur());
			aGC.fillRect(event.getX(), event.getY(), aForme.getHauteur(), aForme.getLargeur());
			aGC.strokeRect(event.getX()+15, event.getY()+15, aForme.getHauteur(), aForme.getLargeur());
			aGC.fillRect(event.getX()+15, event.getY()+15, aForme.getHauteur(), aForme.getLargeur());
		}
		else if(typeForme == "double_cercle")
		{
			aGC.strokeOval(event.getX(), event.getY(), aForme.getRayon()*2, aForme.getRayon()*2);
			aGC.fillOval(event.getX(), event.getY(), aForme.getRayon()*2, aForme.getRayon()*2);
			aGC.strokeOval(event.getX()+10, event.getY()+10, aForme.getRayon()*2, aForme.getRayon()*2);
			aGC.fillOval(event.getX()+10, event.getY()+10, aForme.getRayon()*2, aForme.getRayon()*2);
		}
		else if(typeForme == "rectangle_barre")
		{
			aGC.strokeRect(event.getX(), event.getY(), aForme.getLargeur(), aForme.getHauteur());
			aGC.fillRect(event.getX(), event.getY(), aForme.getLargeur(), aForme.getHauteur());
			aGC.strokeLine(event.getX(), event.getY()+aForme.getHauteur(), event.getX()+aForme.getLargeur(), event.getY());
		}
		else if(typeForme == "source")
		{
			aGC.strokeOval(event.getX(), event.getY(), aForme.getLargeur(), aForme.getHauteur());
			aGC.fillOval(event.getX(), event.getY(), aForme.getLargeur(), aForme.getHauteur());
			aGC.strokeText("Source", event.getX()+aForme.getHauteur()/2, event.getY()+aForme.getHauteur()/2);
		}
		else if(typeForme == "carre_sup")
		{
			aGC.strokeRect(event.getX(), event.getY(), aForme.getHauteur(), aForme.getLargeur());
			aGC.fillRect(event.getX(), event.getY(), aForme.getHauteur(), aForme.getLargeur());
			aGC.strokeLine(event.getX(), event.getY(), event.getX()+aForme.getHauteur(), event.getY()+aForme.getHauteur()/2);
			aGC.strokeLine(event.getX(), event.getY()+aForme.getHauteur(), event.getX()+aForme.getHauteur(), event.getY()+aForme.getHauteur()/2);
		}
		else if(typeForme == "carre_inf")
		{
			aGC.strokeRect(event.getX(), event.getY(), aForme.getHauteur(), aForme.getLargeur());
			aGC.fillRect(event.getX(), event.getY(), aForme.getHauteur(), aForme.getLargeur());
			aGC.strokeLine(event.getX()+aForme.getHauteur(), event.getY(), event.getX(), event.getY()+aForme.getHauteur()/2);
			aGC.strokeLine(event.getX()+aForme.getHauteur(), event.getY()+aForme.getHauteur(), event.getX(), event.getY()+aForme.getHauteur()/2);
		}
		typeForme = null;
		aForme = null;
	}
	
	@FXML
	void SceneDragOver(DragEvent event) {
		event.acceptTransferModes(TransferMode.ANY);
		event.consume();
	}
	
	@FXML
	void CanvasDragOver(DragEvent event) {
		event.acceptTransferModes(TransferMode.ANY);
		event.consume();
	}
	
	@FXML
	void CanvasMousePressed(MouseEvent event) { //Pour dessiner une flèche
		coordonneeXDebutFleche = event.getX();
		coordonneeYDebutFleche = event.getY();
	}
	
	@FXML
	void CanvasMouseReleased(MouseEvent event) {
		aGC = leCanvas.getGraphicsContext2D();	
		aGC.setStroke(Color.BLACK);
		aGC.strokeLine(coordonneeXDebutFleche, coordonneeYDebutFleche, event.getX(), event.getY());
	}
	
}
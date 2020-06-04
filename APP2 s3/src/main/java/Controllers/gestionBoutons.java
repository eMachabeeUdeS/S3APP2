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
import javafx.scene.shape.Rectangle;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.SnapshotParameters;
import javafx.scene.image.*;
import javafx.scene.canvas.*;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import models.*;
import models.FormeFactory.eForme;
import javafx.scene.paint.Color;
import javafx.scene.image.PixelReader;

public class gestionBoutons {
	State etat = new StateDrawComponents();
	FormeFactory inversion = new FormeFactoryInversion();
	FormeFactory energy = new FormeFactoryEnergy();
	FormeFactory strategy = new FormeFactoryStrategy();
	FormeFactory model = new FormeFactoryModel();
	String typeForme;
	double coordonneeXDebutFleche;
	double coordonneeYDebutFleche;
	PixelReader pixelReader;
	
	double angle = 0.7853982; //45 degrés en radians
	int longueur = 20;
	
	Forme aForme;
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
	private Button btnRedArrow;
	
	@FXML
	private Button btnBlackArrow;
	

	
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
			etat.drawComponent(aGC, typeForme, event.getX(), event.getY(), aForme);
			typeForme = null;
			aForme = null;
		event.consume();
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
		WritableImage image = leCanvas.snapshot(new SnapshotParameters(), null);
		Color color = image.getPixelReader().getColor((int) event.getX(), (int) event.getY());
		if(color.equals(Color.RED) || color.equals(Color.web("#008000"))) {
				etat.setCoordonneeXDebutFleche(event.getX());
				etat.setCoordonneeYDebutFleche(event.getY());
		}
		event.consume();
	}
	
	@FXML
	void CanvasMouseReleased(MouseEvent event) {	
		WritableImage image = leCanvas.snapshot(new SnapshotParameters(), null);
		Color color = image.getPixelReader().getColor((int) event.getX(), (int) event.getY());
		aGC = leCanvas.getGraphicsContext2D();
		if(color.equals(Color.RED) || color.equals(Color.web("#008000"))) {
			etat.drawArrow(aGC, event.getX(), event.getY());
		}
		event.consume();
	}
	
	@FXML
	void btnRedArrowClick(ActionEvent event) {
		etat = new StateRedArrow();
		System.out.println(etat.getEtat());
	}
	
	@FXML
	void btnBlackArrowClick(ActionEvent event) {
		etat = new StateBlackArrow();
		System.out.println(etat.getEtat());
	}
	
	@FXML
	void btnPlusClick(ActionEvent event) {
		etat = new StateDrawComponents();
		System.out.println(etat.getEtat());
	}
}
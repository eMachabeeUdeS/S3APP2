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
import models.*;
import models.FormeFactory.eForme;
import Controllers.Ressources_Controllers.*;
import javafx.scene.paint.Color;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.Deque;

public class gestionBoutonsToolbar {
	State etat;
	FormeFactory inversion = new FormeFactoryInversion();
	FormeFactory energy = new FormeFactoryEnergy();
	FormeFactory strategy = new FormeFactoryStrategy();
	FormeFactory model = new FormeFactoryModel();
	String typeForme;
	Commande[] commandes = new Commande[4];
	Controller controleur;
	InfosAjoutRetrait infosredo;
	InfosAjoutRetrait infosundo;
	Deque<InfosAjoutRetrait> redoStack = new ArrayDeque<InfosAjoutRetrait>();
	Deque<InfosAjoutRetrait> undoStack = new ArrayDeque<InfosAjoutRetrait>();
	
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
	private Button buttonArrow;
	
	@FXML
	private Button buttonCrayon;
	
	@FXML
	private Button buttonDelete;
	
	@FXML
	private Button buttonFullscreen;
	
	@FXML
	private Button buttonInfo;
	
	@FXML
	private Button buttonInversion;
	
	@FXML
	private MenuButton buttonItemSelected;
	
	@FXML
	private Button buttonLeftAlignment;
	
	@FXML
	private Button buttonMarker;
	
	@FXML
	private Button buttonMove;
	
	@FXML
	private Button buttonPict;
	
	@FXML
	private Button buttonTopAlign;
	
	@FXML
	private Label state_id;
	
	@FXML
	private MenuItem redo;
	
	@FXML
	private MenuItem undo;
	
	@FXML
	void btnPlusClick (ActionEvent event) {
	etat = new AddModeState();
	state_id.setText(etat.editStatusBar());
	}
	
	@FXML
	void btnFullscreenClick (ActionEvent event) {
	etat = new FullscreenState();
	state_id.setText(etat.editStatusBar());
	}
	
	@FXML
	void btnMarkerClick (ActionEvent event) {
	etat = new MarkerState();
	state_id.setText(etat.editStatusBar());
	}
	
	@FXML
	void btnMoveClick (ActionEvent event) {
	etat = new MoveModeState();
	state_id.setText(etat.editStatusBar());
	}
	
	@FXML
	void btnCrayonClick (ActionEvent event) {
	etat = new CrayonModeState();
	state_id.setText(etat.editStatusBar());
	}
	
	@FXML
	void btnInfoClick (ActionEvent event) {
	etat = new InfoModeState();
	state_id.setText(etat.editStatusBar());
	}
	
	@FXML
	void btnPictureClick (ActionEvent event) {
	etat = new PictModeState();
	state_id.setText(etat.editStatusBar());
	}
	
	@FXML
	void btnArrowClick (ActionEvent event) {
	etat = new ArrowState();
	state_id.setText(etat.editStatusBar());
	}
	
	@FXML
	void btnLeftAlignmentClick (ActionEvent event) {
	etat = new LeftAlignmentState();
	state_id.setText(etat.editStatusBar());
	}
	
	
	@FXML
	void btnTopAlignmentClick (ActionEvent event) {
	etat = new TopAlignmentState();
	state_id.setText(etat.editStatusBar());
	}
	
	@FXML
	void btnInversionClick (ActionEvent event) {
	etat = new InversionModeState();
	state_id.setText(etat.editStatusBar());
	}
	
	@FXML
	void undoClick (ActionEvent event) {
		InfosAjoutRetrait temp = controleur.commands[1].execute(undoStack);
		
		redoStack.addLast(undoStack.getLast());
		undoStack.pop();
		controleur.commands[0] = new CommandeRedo();
	}
	
	@FXML
	void redoClick(ActionEvent event) {
		
		undoStack.addLast(redoStack.getLast());
		redoStack.pop();
	}
	
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
		InfosAjoutRetrait ajout = new InfosAjoutRetrait(typeForme, aForme, event.getX(), event.getY());
		this.undoStack.addLast(ajout);
		Commande ajouter = new CommandeAjouter();
		ajouter.execute(ajout, leCanvas, aGC);
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
	
}
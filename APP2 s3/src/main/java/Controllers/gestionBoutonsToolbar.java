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
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.control.ListView;
import models.*;
import models.ShapeFactory.eShape;

public class gestionBoutonsToolbar {
	State etat;
	Ellipse ellipse = new Ellipse();
	ShapeFactory inversion = new ShapeFactoryInversion();
	ShapeFactory energy = new ShapeFactoryEnergy();
	ShapeFactory strategy = new ShapeFactoryStrategy();
	ShapeFactory model = new ShapeFactoryModel();
	
	Shape c = energy.GetShape(eShape.CARRE);
	
	@FXML
	private Rectangle carre_energy;
	
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
	void CarreEnergyDragDetected(MouseEvent event) {
		Dragboard dragboard = carre_energy.startDragAndDrop(TransferMode.ANY);
		ClipboardContent content = new ClipboardContent();
		content.putString("carre_energy");
		dragboard.setContent(content);
		event.consume();
	}
	
	@FXML
	void CanvasDragDrop(MouseEvent event) {
		System.out.println("test");
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
	
}
package Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.event.*;
import Controllers.*;
import State.*;

public class gestionBoutonsToolbar {
	State etat;
	
	Invoker_Command_Toolbar invoker;
	
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
	//invoker.commands[0].execute();
	etat = new AddModeState();
	state_id.setText(etat.editStatusBar());
	}
	
	@FXML
	void btnFullscreenClick (ActionEvent event) {
	//invoker.commands[1].execute();
	etat = new FullscreenState();
	state_id.setText(etat.editStatusBar());
	}
	
	@FXML
	void btnMarkerClick (ActionEvent event) {
	//invoker.commands[2].execute();
	etat = new MarkerState();
	state_id.setText(etat.editStatusBar());
	}
	
	@FXML
	void btnMoveClick (ActionEvent event) {
	//invoker.commands[3].execute();
	etat = new MoveModeState();
	state_id.setText(etat.editStatusBar());
	}
	
	@FXML
	void btnCrayonClick (ActionEvent event) {
	//invoker.commands[4].execute();
	etat = new CrayonModeState();
	state_id.setText(etat.editStatusBar());
	}
	
	@FXML
	void btnInfoClick (ActionEvent event) {
	//invoker.commands[5].execute();
	etat = new InfoModeState();
	state_id.setText(etat.editStatusBar());
	}
	
	@FXML
	void btnPictureClick (ActionEvent event) {
	//invoker.commands[6].execute();
	etat = new PictModeState();
	state_id.setText(etat.editStatusBar());
	}
	
	@FXML
	void btnArrowClick (ActionEvent event) {
	//invoker.commands[7].execute();
	etat = new ArrowState();
	state_id.setText(etat.editStatusBar());
	}
	
	@FXML
	void btnLeftAlignmentClick (ActionEvent event) {
	//invoker.commands[8].execute();
	etat = new LeftAlignmentState();
	state_id.setText(etat.editStatusBar());
	}
	
	
	@FXML
	void btnTopAlignmentClick (ActionEvent event) {
	//invoker.commands[9].execute();
	etat = new TopAlignmentState();
	state_id.setText(etat.editStatusBar());
	}
	
	@FXML
	void btnInversionClick (ActionEvent event) {
	//invoker.commands[10].execute();
	etat = new InversionModeState();
	state_id.setText(etat.editStatusBar());
	}
	
}
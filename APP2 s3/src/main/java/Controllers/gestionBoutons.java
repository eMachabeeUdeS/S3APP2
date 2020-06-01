package Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.event.*;
import State.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.MouseDragEvent;

public class gestionBoutons {
	State etat;
	
	@FXML
	private Button btnRedArrow;
	
	@FXML
	private Button btnBlackArrow;
	
	@FXML
	private Button buttonPlus;
	
	@FXML
	void btnPlusClick(ActionEvent event) {
		etat = new StateDrawComponents();
		System.out.println(etat.getEtat());
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
	void 
	
	
}
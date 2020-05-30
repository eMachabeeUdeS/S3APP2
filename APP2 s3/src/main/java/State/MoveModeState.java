package State;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class MoveModeState implements State {
	
	@FXML
	private TextField state_id;
	
	@Override
	@FXML
	public void editStatusBar() {
		
		state_id.setText("Drag your mouse to move a component");
	}

	@Override
	public String getEtat() {
		return "Move State";
	}

}

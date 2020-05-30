package State;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class FullscreenState implements State {
	@FXML
	private TextField state_id;
	
	@FXML
	@Override
	public void editStatusBar() {	
		
		state_id.setText("Application set on fullscreen");	
	}

	@Override
	public String getEtat() {
		return "Fullscreen State";
	}
}

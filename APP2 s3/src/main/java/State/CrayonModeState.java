package State;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CrayonModeState implements State {

	@FXML
	private TextField state_id;
	
	@Override
	@FXML
	public void editStatusBar() {
		state_id.setText("Draw with the pencil");

	}

	@Override
	public String getEtat() {
		return "Crayon State";
	}

}

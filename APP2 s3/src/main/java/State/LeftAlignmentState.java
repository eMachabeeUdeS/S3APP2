package State;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class LeftAlignmentState implements State {

	@FXML
	private TextField state_id;
	
	@Override
	@FXML
	public void editStatusBar() {
		state_id.setText("Align your canvas to the left");

	}

	@Override
	public String getEtat() {
		return "LeftAlignment State";
	}

}

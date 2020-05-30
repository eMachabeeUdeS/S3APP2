package State;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ArrowState implements State {

	@FXML
	private TextField state_id;
	
	@Override
	@FXML
	public void editStatusBar() {
		state_id.setText("Put an arrow on the canvas");

	}

	@Override
	public String getEtat() {
		return "Arrow State";
	}

}

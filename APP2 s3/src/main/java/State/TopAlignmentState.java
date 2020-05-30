package State;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class TopAlignmentState implements State {

	@FXML
	private TextField state_id;
	
	@FXML
	@Override
	public void editStatusBar() {
		state_id.setText("Align your canvas to the top");

	}

	@Override
	public String getEtat() {
		return "TopAlignment State";
	}

}

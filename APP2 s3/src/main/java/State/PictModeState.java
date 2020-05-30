package State;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PictModeState implements State {

	@FXML
	private TextField state_id;
	
	@Override
	@FXML
	public void editStatusBar() {
		state_id.setText("Insert a picture in your canvas");

	}

	@Override
	public String getEtat() {
		return "PictMode State";
	}

}

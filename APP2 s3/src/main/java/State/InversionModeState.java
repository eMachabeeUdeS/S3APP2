package State;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class InversionModeState implements State {

	@FXML
	private TextField state_id;
	
	@Override
	@FXML
	public void editStatusBar() {
		state_id.setText("Inversion mode");

	}

	@Override
	public String getEtat() {
		return "Inversion Mode State";
	}

}

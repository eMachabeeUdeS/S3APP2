package State;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class InfoModeState implements State {

	@FXML
	private TextField state_id;
	
	@Override
	@FXML
	public void editStatusBar() {
		
		state_id.setText("Get information on the software");
	}

	@Override
	public String getEtat() {
		return "InfoMode State";
	}

}

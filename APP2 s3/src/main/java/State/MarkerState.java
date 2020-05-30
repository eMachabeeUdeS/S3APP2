package State;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class MarkerState implements State {

	@FXML
	private TextField state_id;
	
	@Override
	@FXML
	public void editStatusBar() {
		
		state_id.setText("Draw using the maker");
	}

	@Override
	public String getEtat() {
		return "Marker State";
	}

}

package State;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ItemSelectedState implements State {

	@FXML
	private TextField state_id;
	
	@Override
	@FXML
	public void editStatusBar() {
		state_id.setText("Select an item");

	}

	@Override
	public String getEtat() {
		return "Item Selected State";
	}

}

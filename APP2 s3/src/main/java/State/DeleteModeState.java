package State;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class DeleteModeState implements State {
	@FXML
	private TextField state_id;
	
	@Override
	@FXML
	public void editStatusBar()
	{
		state_id.setText("Delete mode, please click on a figure to delete it");
	}
	
	@Override
	public String getEtat()
	{
		return "Delete mode State";
	}
}

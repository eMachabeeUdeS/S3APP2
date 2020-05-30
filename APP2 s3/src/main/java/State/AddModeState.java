package State;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class AddModeState implements State{
	@FXML
	private TextField state_id;
	
	@Override
	@FXML
	public void editStatusBar()
	{
		state_id.setText("Create a new canvas");
	}

	@Override
	public String getEtat() {
		return "Addmode State";
	}
	
}

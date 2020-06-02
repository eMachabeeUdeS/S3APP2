package State;

public class XMLState implements State{

	@Override
	public String editStatusBar() {
		return "Write or load an FXML file";
	}

	@Override
	public String getEtat() {
		return "XML file State";
	}

}

package State;

public class CloseState implements State {
	@Override
	public String editStatusBar() {
		
		return "This menu item would normally close the program";
	}

	@Override
	public String getEtat() {
		return "Close State";
	}
}

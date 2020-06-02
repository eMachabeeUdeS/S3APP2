package State;

public class RedoState implements State {
	@Override
	public String editStatusBar() {
		
		return "Redo the action that was undone";
	}

	@Override
	public String getEtat() {
		return "Redo State";
	}
}

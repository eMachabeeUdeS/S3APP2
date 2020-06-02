package State;

public class UndoState implements State {
	@Override
	public String editStatusBar() {
		
		return "Undo the last action";
	}

	@Override
	public String getEtat() {
		return "Undo State";
	}
}

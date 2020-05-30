package State;

public class MoveModeState implements State {
		
	@Override
	public String editStatusBar() {
		
		return "Drag your mouse to move a component";
	}

	@Override
	public String getEtat() {
		return "Move State";
	}

}

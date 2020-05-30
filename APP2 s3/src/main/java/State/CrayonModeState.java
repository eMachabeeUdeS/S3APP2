package State;

public class CrayonModeState implements State {

	@Override
	public String editStatusBar() {
		return "Draw with the pencil";

	}

	@Override
	public String getEtat() {
		return "Crayon State";
	}

}

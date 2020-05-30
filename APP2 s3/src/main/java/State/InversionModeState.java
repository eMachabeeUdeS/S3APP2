package State;

public class InversionModeState implements State {

	@Override
	public String editStatusBar() {
		return "Inversion mode";

	}

	@Override
	public String getEtat() {
		return "Inversion Mode State";
	}

}

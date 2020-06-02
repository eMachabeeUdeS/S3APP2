package State;

public class BlackArrowState implements State {
	@Override
	public String editStatusBar() {
		return "Black arrow selected";

	}

	@Override
	public String getEtat() {
		return "BlackArrow State";
	}
}

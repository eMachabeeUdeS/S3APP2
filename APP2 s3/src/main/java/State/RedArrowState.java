package State;

public class RedArrowState implements State {
	@Override
	public String editStatusBar() {
		return "Red arrow selected";

	}

	@Override
	public String getEtat() {
		return "RedArrow State";
	}
}

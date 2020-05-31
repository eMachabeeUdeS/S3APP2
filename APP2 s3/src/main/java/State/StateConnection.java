package State;

public class StateConnection implements State {

	@Override
	public String editStatusBar() {
		return "Connect components with arrows";
	}

	@Override
	public String getEtat() {
		return "Connection State";
	}

}

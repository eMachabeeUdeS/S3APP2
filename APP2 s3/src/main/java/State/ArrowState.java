package State;

public class ArrowState implements State {

	@Override
	public String editStatusBar() {
		return "Put an arrow on the canvas";

	}

	@Override
	public String getEtat() {
		return "Arrow State";
	}

}

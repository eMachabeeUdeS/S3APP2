package State;

public class LeftAlignmentState implements State {
	
	@Override
	public String editStatusBar() {
		return "Align your canvas to the left";

	}

	@Override
	public String getEtat() {
		return "LeftAlignment State";
	}

}

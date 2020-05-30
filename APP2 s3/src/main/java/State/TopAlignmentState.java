package State;

public class TopAlignmentState implements State {
	
	@Override
	public String editStatusBar() {
		return "Align your canvas to the top";

	}

	@Override
	public String getEtat() {
		return "TopAlignment State";
	}

}

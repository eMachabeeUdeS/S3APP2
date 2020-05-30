package State;

public class InfoModeState implements State {

	@Override
	public String editStatusBar() {
		
		return "Get information on the software";
	}

	@Override
	public String getEtat() {
		return "InfoMode State";
	}

}

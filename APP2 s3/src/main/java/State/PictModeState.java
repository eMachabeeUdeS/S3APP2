package State;

public class PictModeState implements State {
	
	@Override
	public String editStatusBar() {
		return "Insert a picture in your canvas";

	}

	@Override
	public String getEtat() {
		return "PictMode State";
	}

}

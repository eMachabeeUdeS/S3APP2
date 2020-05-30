package State;

public class FullscreenState implements State {

	@Override
	public String editStatusBar() {	
		
		return "Application set on fullscreen";
	}

	@Override
	public String getEtat() {
		return "Fullscreen State";
	}
}

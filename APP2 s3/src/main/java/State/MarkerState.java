package State;

public class MarkerState implements State {
	
	@Override
	public String editStatusBar() {
		
		return "Draw using the marker";
	}

	@Override
	public String getEtat() {
		return "Marker State";
	}

}

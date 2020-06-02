package State;

public class AboutState implements State{
	@Override
	public String editStatusBar() {
		
		return "Show more info about the current program";
	}

	@Override
	public String getEtat() {
		return "More State";
	}
}

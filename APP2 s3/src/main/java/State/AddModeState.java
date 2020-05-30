package State;

public class AddModeState implements State{
	
	@Override
	public String editStatusBar()
	{
		return "Create a new canvas";
	}

	@Override
	public String getEtat() {
		return "Addmode State";
	}
	
}

package State;

public class DeleteState implements State{
	@Override
	public String editStatusBar() {
		
		return "Delete a shape or arrow on the canvas";
	}

	@Override
	public String getEtat() {
		return "Delete State";
	}
}

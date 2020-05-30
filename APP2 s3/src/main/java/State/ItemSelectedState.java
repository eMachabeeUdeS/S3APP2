package State;

public class ItemSelectedState implements State {
	
	@Override

	public String editStatusBar() {
		return "Select an item";

	}

	@Override
	public String getEtat() {
		return "Item Selected State";
	}

}

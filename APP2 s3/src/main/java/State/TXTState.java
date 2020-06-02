package State;

public class TXTState implements State {

	@Override
	public String editStatusBar() {
		return "Write or load a TXT File.";
	}

	@Override
	public String getEtat() {
		return "TXT State";
	}

}

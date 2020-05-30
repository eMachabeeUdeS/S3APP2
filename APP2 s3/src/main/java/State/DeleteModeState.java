package State;

public class DeleteModeState implements State {

	@Override
	public String editStatusBar()
	{
		return "Delete mode, please click on a figure to delete it";
	}
	
	@Override
	public String getEtat()
	{
		return "Delete mode State";
	}
}

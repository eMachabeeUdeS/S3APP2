package State;

//This class makes part of the design pattern STATE together with class AboutState, class ArrowState, class BlackArrowState, class CloseState,
//CrayonModeState, class DeleteState, class FullscreenState, class InfoModeState, class InversionModeState, class ItemSelectedState, class
//LeftAlignmentState, class MarkerState, class MoveModeState, class PictModeState, class RedArrowState, class RedoState, class TopAlignmentState,
//class UndoState and interface State.

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

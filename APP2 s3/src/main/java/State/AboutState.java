package State;

//This class makes part of the design pattern STATE together with class AddModeState, class ArrowState, class BlackArrowState, class CloseState,
//CrayonModeState, class DeleteState, class FullscreenState, class InfoModeState, class InversionModeState, class ItemSelectedState, class
//LeftAlignmentState, class MarkerState, class MoveModeState, class PictModeState, class RedArrowState, class RedoState, class TopAlignmentState,
//class UndoState and interface State.

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

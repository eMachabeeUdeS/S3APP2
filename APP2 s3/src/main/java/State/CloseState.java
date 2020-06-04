package State;

//This class makes part of the design pattern STATE together with class AboutState, class AddModeState, class ArrowState, class BlackArrowState,
//CrayonModeState, class DeleteState, class FullscreenState, class InfoModeState, class InversionModeState, class ItemSelectedState, class
//LeftAlignmentState, class MarkerState, class MoveModeState, class PictModeState, class RedArrowState, class RedoState, class TopAlignmentState,
//class UndoState and interface State.

public class CloseState implements State {
	@Override
	public String editStatusBar() {
		
		return "This menu item would normally close the program";
	}

	@Override
	public String getEtat() {
		return "Close State";
	}
}

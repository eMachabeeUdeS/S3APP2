package State;

//This class makes part of the design pattern STATE together with class AboutState, class AddModeState, class ArrowState, class BlackArrowState,
//CloseState, class CrayonModeState, class FullscreenState, class InfoModeState, class InversionModeState, class ItemSelectedState, class
//LeftAlignmentState, class MarkerState, class MoveModeState, class PictModeState, class RedArrowState, class RedoState, class TopAlignmentState,
//class UndoState and interface State.

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

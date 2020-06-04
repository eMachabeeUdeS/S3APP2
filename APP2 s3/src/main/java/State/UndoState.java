package State;

//This class makes part of the design pattern STATE together with class AboutState, class AddModeState, class ArrowState, class BlackArrowState,
//CloseState, class CrayonModeState, class DeleteState, class FullscreenState, class InfoModeState, class InversionModeState, class
//ItemSelectedState, class LeftAlignmentState, class MarkerState, class MoveModeState, class PictModeState, class RedArrowState, class
//RedoState, class TopAlignmentState and interface State.

public class UndoState implements State {
	@Override
	public String editStatusBar() {
		
		return "Undo the last action";
	}

	@Override
	public String getEtat() {
		return "Undo State";
	}
}

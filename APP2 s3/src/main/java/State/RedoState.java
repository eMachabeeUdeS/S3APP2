package State;

//This class makes part of the design pattern STATE together with class AboutState, class AddModeState, class ArrowState, class BlackArrowState,
//CloseState, class CrayonModeState, class DeleteState, class FullscreenState, class InfoModeState, class InversionModeState, class
//ItemSelectedState, class LeftAlignmentState, class MarkerState, class MoveModeState, class PictModeState, class RedArrowState, class
//TopAlignmentState, class UndoState and interface State.

public class RedoState implements State {
	@Override
	public String editStatusBar() {
		
		return "Redo the action that was undone";
	}

	@Override
	public String getEtat() {
		return "Redo State";
	}
}

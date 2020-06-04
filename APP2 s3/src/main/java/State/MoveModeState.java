package State;
//This class makes part of the design pattern STATE together with class AboutState, class AddModeState, class ArrowState, class BlackArrowState,
//CloseState, class CrayonModeState, class DeleteState, class FullscreenState, class InfoModeState, class InversionModeState, class
//ItemSelectedState, class LeftAlignmentState, class MarkerState, class PictModeState, class RedArrowState, class RedoState, class TopAlignmentState,
//class UndoState and interface State.

public class MoveModeState implements State {
		
	@Override
	public String editStatusBar() {
		
		return "Drag your mouse to move a component";
	}

	@Override
	public String getEtat() {
		return "Move State";
	}

}

package State;

//This class makes part of the design pattern STATE together with class AboutState, class AddModeState, class ArrowState, class BlackArrowState,
//CloseState, class CrayonModeState, class DeleteState, class InfoModeState, class InversionModeState, class ItemSelectedState, class
//LeftAlignmentState, class MarkerState, class MoveModeState, class PictModeState, class RedArrowState, class RedoState, class TopAlignmentState,
//class UndoState and interface State.

public class FullscreenState implements State {

	@Override
	public String editStatusBar() {	
		
		return "Application set on fullscreen";
	}

	@Override
	public String getEtat() {
		return "Fullscreen State";
	}
}

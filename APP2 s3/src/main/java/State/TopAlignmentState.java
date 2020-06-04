package State;

//This class makes part of the design pattern STATE together with class AboutState, class AddModeState, class ArrowState, class BlackArrowState,
//CloseState, class CrayonModeState, class DeleteState, class FullscreenState, class InfoModeState, class InversionModeState, class
//ItemSelectedState, class LeftAlignmentState, class MarkerState, class MoveModeState, class PictModeState, class RedArrowState, class
//RedoState, class UndoState and interface State.

public class TopAlignmentState implements State {
	
	@Override
	public String editStatusBar() {
		return "Align your canvas to the top";

	}

	@Override
	public String getEtat() {
		return "TopAlignment State";
	}

}

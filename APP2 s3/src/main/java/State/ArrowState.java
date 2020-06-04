package State;

//This class makes part of the design pattern STATE together with class AboutState, class AddModeState, class BlackArrowState, class CloseState,
//CrayonModeState, class DeleteState, class FullscreenState, class InfoModeState, class InversionModeState, class ItemSelectedState, class
//LeftAlignmentState, class MarkerState, class MoveModeState, class PictModeState, class RedArrowState, class RedoState, class TopAlignmentState,
//class UndoState and interface State.

public class ArrowState implements State {

	@Override
	public String editStatusBar() {
		return "Put an arrow on the canvas";

	}

	@Override
	public String getEtat() {
		return "Arrow State";
	}

}

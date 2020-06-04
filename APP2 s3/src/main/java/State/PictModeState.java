package State;

//This class makes part of the design pattern STATE together with class AboutState, class AddModeState, class ArrowState, class BlackArrowState,
//CloseState, class CrayonModeState, class DeleteState, class FullscreenState, class InfoModeState, class InversionModeState, class
//ItemSelectedState, class LeftAlignmentState, class MarkerState, class MoveModeState, class RedArrowState, class RedoState, class TopAlignmentState,
//class UndoState and interface State.

public class PictModeState implements State {
	
	@Override
	public String editStatusBar() {
		return "Insert a picture in your canvas";

	}

	@Override
	public String getEtat() {
		return "PictMode State";
	}

}

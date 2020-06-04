package State;

//This class makes part of the design pattern STATE together with class AboutState, class AddModeState, class ArrowState, class BlackArrowState,
//CloseState, class CrayonModeState, class DeleteState, class FullscreenState, class InfoModeState, class ItemSelectedState, class
//LeftAlignmentState, class MarkerState, class MoveModeState, class PictModeState, class RedArrowState, class RedoState, class TopAlignmentState,
//class UndoState and interface State.

public class InversionModeState implements State {

	@Override
	public String editStatusBar() {
		return "Inversion mode";

	}

	@Override
	public String getEtat() {
		return "Inversion Mode State";
	}

}

package State;

//This class makes part of the design pattern STATE together with class AboutState, class AddModeState, class ArrowState, class BlackArrowState,
//CloseState, class CrayonModeState, class DeleteState, class FullscreenState, class InfoModeState, class InversionModeState, class
//LeftAlignmentState, class MarkerState, class MoveModeState, class PictModeState, class RedArrowState, class RedoState, class TopAlignmentState,
//class UndoState and interface State.



public class ItemSelectedState implements State {
	
	@Override

	public String editStatusBar() {
		return "Select an item";

	}

	@Override
	public String getEtat() {
		return "Item Selected State";
	}

}

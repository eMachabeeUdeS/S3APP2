package State;

//This class makes part of the design pattern STATE together with class AboutState, class AddModeState, class ArrowState, class BlackArrowState,
//CloseState, class CrayonModeState, class DeleteState, class FullscreenState, class InfoModeState, class InversionModeState, class
//ItemSelectedState, class LeftAlignmentState, class MoveModeState, class PictModeState, class RedArrowState, class RedoState, class TopAlignmentState,
//class UndoState and interface State.

public class MarkerState implements State {
	
	@Override
	public String editStatusBar() {
		
		return "Draw using the marker";
	}

	@Override
	public String getEtat() {
		return "Marker State";
	}

}

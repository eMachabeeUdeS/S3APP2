package State;

//This interface makes part of the design pattern STATE together with class AboutState, class AddModeState, class ArrowState, class BlackArrowState,
//CloseState, class CrayonModeState, class DeleteState, class FullscreenState, class InfoModeState, class InversionModeState, class
//ItemSelectedState, class LeftAlignmentState, class MarkerState, class MoveModeState, class PictModeState, class RedArrowState, class
//TopAlignmentState and class UndoState.

public interface State {
	
	public String editStatusBar();
	public String getEtat();
}

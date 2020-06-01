package Controllers;

import java.util.Deque;

import Controllers.Ressources_Controllers.InfosAjoutRetrait;

public class CommandeUndo implements Commande{

	@Override
	public InfosAjoutRetrait execute(Deque<InfosAjoutRetrait> Stack) {
		return Stack.getLast();
	}
}

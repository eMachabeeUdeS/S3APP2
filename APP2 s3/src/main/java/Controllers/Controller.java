package Controllers;

//This class makes part of the design pattern COMMAND together with class CommandeAjouter, class CommandeRetirer and interface Commande.

public class Controller {
	private Commande commande1 = new CommandeAjouter();
	private Commande commande2 = new CommandeRetirer();

	public Commande getCommande1() {
		return commande1;
	}
	
	public Commande getCommande2() {
		return commande2;
	}
}

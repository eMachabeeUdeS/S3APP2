package Controllers;

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

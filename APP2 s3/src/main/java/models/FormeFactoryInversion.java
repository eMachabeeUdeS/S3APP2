package models;
import javafx.scene.paint.Color;
import models.FormeFactory.eForme;

public class FormeFactoryInversion implements FormeFactory{

	@Override
	public Forme GetForme(eForme forme)
	{
		Forme f;
		
		if (forme==eForme.CERCLE)
		{
			f = new Cercle();
			f.setRayon(20);
			f.setCouleur(Color.web("#87CEEB"));
			f.setBordure(Color.web("#0000FF"));
		}
		else if (forme==eForme.CARRE)
		{
			f = new Carre();
			f.setHauteur(40);
			f.setLargeur(40);
			f.setCouleur(Color.web("#87CEEB"));
			f.setBordure(Color.web("#0000FF"));
		}
		else if (forme==eForme.RECTANGLE)
		{
			f = new Rectangle();
			f.setHauteur(40);
			f.setLargeur(20);
			f.setCouleur(Color.web("#87CEEB"));
			f.setBordure(Color.web("#0000FF"));
		}
		else if (forme==eForme.SOURCE)
		{
			f = new source();
			f.setCouleur(Color.web("#98FB98"));
			f.setBordure(Color.web("#008000"));
			f.setHauteur(30);
			f.setLargeur(60);
		}
		else if (forme==eForme.FLECHE) {
			f = new Fleche();
			f.setBordure(Color.BLACK);
		}
		else
		{
			return null;
		}
		
		return f;
	}
}

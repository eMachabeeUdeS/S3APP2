package models;

import javafx.scene.paint.Color;
import models.FormeFactory.eForme;


public class FormeFactoryModel implements FormeFactory {

	@Override
	public Forme GetForme(eForme forme)
	{
		Forme f = new Forme();
		f.setCouleur(Color.web("#EE82EE"));
		f.setBordure(Color.web("#0000FF"));
		
		if (forme==eForme.CERCLE)
		{
			f.setRayon(20);
		}
		else if (forme==eForme.CARRE)
		{
			f.setHauteur(40);
			f.setLargeur(40);
		}
		else if (forme==eForme.RECTANGLE)
		{
			f.setHauteur(40);
			f.setLargeur(20);
		}
		else if (forme==eForme.SOURCE)
		{
			f.setCouleur(Color.web("#98FB98"));
			f.setBordure(Color.web("#008000"));
			f.setHauteur(30);
			f.setLargeur(60);
		}
		else if (forme==eForme.FLECHE) {
			f.setBordure(Color.BLACK);
		}
		else
		{
			return null;
		}
		
		return f;
	}

}

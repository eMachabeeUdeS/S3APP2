package models;

import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class carreStrategy extends Shape{
	
	carreStrategy(){
		Rectangle c = new Rectangle();
		c.setFill(Color.web("#0000FF"));
		c.setStroke(Color.web("#0000FF"));
		c.setWidth(40);
		c.setHeight(40);
	}

}

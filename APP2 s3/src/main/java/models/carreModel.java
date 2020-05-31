package models;

import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class carreModel extends Shape{

	carreModel(){
		Rectangle c = new Rectangle();
		c.setFill(Color.web("#EE82EE"));
		c.setStroke(Color.web("#0000FF"));
		c.setWidth(40);
		c.setHeight(40);
	}
	
}

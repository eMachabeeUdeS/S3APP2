package models;
import javafx.scene.shape.*;
import javafx.scene.paint.Color;

public class carreEnergy extends Shape {
	
	carreEnergy(){
		Rectangle c = new Rectangle();
		c.setFill(Color.web("#FFD700"));
		c.setStroke(Color.web("#FF0000"));
		c.setWidth(40);
		c.setHeight(40);
	}

}

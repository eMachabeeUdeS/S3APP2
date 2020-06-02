package models;
import javafx.scene.shape.*;
import javafx.scene.paint.Color;
import javafx.scene.control.Label;
import javafx.scene.control.Label.*;

public class source extends Shape {

	source(){
		Ellipse e = new Ellipse(30, 14);
		e.setFill(Color.web("#98FB98"));
		e.setStroke(Color.web("#008000"));
		Label l = new Label();
		l.setText("Source");
	}

}

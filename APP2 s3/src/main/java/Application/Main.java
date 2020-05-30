package Application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import java.io.IOException;

public class Main extends Application{
    
    private Stage primaryStage;
    private Scene rootlayout;
    
    @Override
    public void start(Stage primaryStage) {
        
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("EMR Editor");

        initRootLayout();

        }
    
    

    public void initRootLayout() {
        try {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("vue.fxml"));
        rootlayout = (Scene) loader.load();
        primaryStage.setScene(rootlayout);
        primaryStage.setMinHeight(550);
        primaryStage.setMinWidth(1050);
        primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
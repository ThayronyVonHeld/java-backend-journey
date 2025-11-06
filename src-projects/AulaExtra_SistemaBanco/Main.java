package AulaExtra_SistemaBanco;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Main extends Application {

    public static void main(String[] args) {
    launch(args);

    }

    @Override
    public void start(Stage stage) throws Exception {

        //Stage stage = new Stage();
        Group root = new Group();

        Scene scene = new Scene(root, 800, 600, Color.web("#1E3552"));

        Image icon = new Image("icon.png");
        stage.getIcons().add(icon);
        stage.setTitle("Solidarity Bank");

        stage.setWidth(420);
        stage.setHeight(420);
        stage.setResizable(false);
        //stage.setX(50);
        //stage.setY(50);
        //stage.setFullScreen(true);


        stage.setScene(scene);
        stage.show();
    }
}

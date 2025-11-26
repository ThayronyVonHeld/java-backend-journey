package JavaFX;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class Main extends Application {


    @Override

    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));

        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("Solidarity Bank");
        primaryStage.show();

        Image icon = new Image("icon.png");
        primaryStage.getIcons().add(icon);

        primaryStage.setResizable(true);
    }
    public static void main(String[] args) {
        launch(args);
    }
}

/*
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
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

        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));

        Scene scene = new Scene(root);

        Image icon = new Image("icon.png");
        stage.getIcons().add(icon);
        stage.setTitle("Solidarity Bank");

        stage.setWidth(520); //Ajusta a largura para 520
        stage.setHeight(520); // ajusta a altura para 520

        stage.setResizable(true); //Para permitir editar a altura/largura da aplicação

        //stage.setX(50);
        //stage.setY(50);
        //stage.setFullScreen(true);


        stage.setScene(scene);
        stage.show();
    }
}
*/








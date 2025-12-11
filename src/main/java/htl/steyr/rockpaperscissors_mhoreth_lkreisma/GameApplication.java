package htl.steyr.rockpaperscissors_mhoreth_lkreisma;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import javafx.scene.image.Image;
import javafx.stage.Stage;


import java.io.IOException;


public class GameApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(GameApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setResizable(false);
        //einbinden der css
        scene.getStylesheets().add(GameApplication.class.getResource("style.css").toExternalForm());
        stage.setTitle("Rock! Paper! Scissors!");
        stage.setScene(scene);
        Image icon = new Image("htl/steyr/rockpaperscissors_mhoreth_lkreisma/pictures/iconphoto.png");
        stage.getIcons().add(icon);
        stage.show();
    }
}

package htl.steyr.rockpaperscissors_mhoreth_lkreisma;

import javafx.application.Application;

public class Launcher {
    public static void main(String[] args) {
        Application.launch(GameApplication.class, args);
    }
}

/*
@Module-info.java --> datei wurde gelöscht weil man diese nicht braucht
module htl.steyr.rockpaperscissors_mhoreth_lkreisma {
    requires javafx.controls;
    requires javafx.fxml;


    opens htl.steyr.rockpaperscissors_mhoreth_lkreisma to javafx.fxml;
    exports htl.steyr.rockpaperscissors_mhoreth_lkreisma;
}
 */
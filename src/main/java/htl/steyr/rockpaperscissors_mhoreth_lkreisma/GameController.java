package htl.steyr.rockpaperscissors_mhoreth_lkreisma;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;

public class GameController {
    private String weapon;


    public void weaponButtonClicked(ActionEvent actionEvent) {
        //holt sich das was auf dem Button steht
        weapon = ((Button) actionEvent.getSource()).getText();
        //in weapon steht nun die ausgewählte Waffe (Rock) (Paper) (Scissors)


        }

    }


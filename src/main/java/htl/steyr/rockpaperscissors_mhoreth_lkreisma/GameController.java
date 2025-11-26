package htl.steyr.rockpaperscissors_mhoreth_lkreisma;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

public class GameController {
    public ImageView myWeaponImageView;
    public ImageView botWeaponImageView;
    public ImageView stoneImageView;
    public ImageView paperImageView;
    public ImageView scissorsImageView;

    private Computer computer = new Computer();
    private String myWeapon;
    private String botWeapon = computer.chosenWeapon();


    public void weaponButtonClicked(ActionEvent actionEvent) {
        //holt sich das was auf dem Button steht
        myWeapon = ((Button) actionEvent.getSource()).getText();
        //in weapon steht nun die ausgewählte Waffe (Rock) (Paper) (Scissors)


    }




    public boolean winnerOfMatch() {
        if (botWeapon.equals("Stone") && myWeapon.equals("Scissors") ||
                botWeapon.equals("Scissors") && myWeapon.equals("Paper") ||
                botWeapon.equals("Paper") && myWeapon.equals("Stone")){
            return true;
        }else {
            return false;
        }
    }

}

    
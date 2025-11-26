package htl.steyr.rockpaperscissors_mhoreth_lkreisma;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Objects;

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

        Image botImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream(pictureOfBot())));
        botWeaponImageView.setImage(botImage);
        Image myImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream(pictureOfMe())));
        myWeaponImageView.setImage(myImage);



    }

    public String pictureOfBot(){
        return switch(botWeapon){
            case "Rock" -> "pictures/Stone.png";
            case "Paper" -> "pictures/Paper.png";
            case "Scissors" -> "pictures/Scissors.png";
            default -> null;
        };
    }
    public String pictureOfMe(){
        return switch(myWeapon){
            case "Rock" -> "pictures/stone.png";
            case "Paper" -> "pictures/paper.png";
            case "Scissors" -> "pictures/scissors.png";
            default -> null;
        };
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

    
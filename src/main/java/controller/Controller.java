package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.Player;

public class Controller {
    @FXML
    Button buttonExit;

    @FXML
    Button button1;

    @FXML
    Button button2;

    @FXML
    Button button3;

    @FXML
    Button button4;

    @FXML
    Button button5;

    @FXML
    Button button6;

    @FXML
    Button button7;

    @FXML
    Button button8;

    @FXML
    Button button9;

    @FXML
    Button buttonNew;

    @FXML
    Label labelFirstName;

    @FXML
    Label labelSecondName;

    @FXML
    TextField textFieldFirstName;

    @FXML
    TextField textFieldSecondName;

    @FXML
    public void onActionButtonExitMainScene(ActionEvent actionEvent) {
        System.exit(0);
    }

    @FXML
    public void onActionButtonNewMainScene(ActionEvent actionEvent) {
        String firstName = textFieldFirstName.getText().trim();
        String secondName = textFieldSecondName.getText().trim();

        if (firstName.isEmpty() || secondName.isEmpty()) {
            System.out.println("One name is Empty");
        } else {
            labelFirstName.setText(firstName);
            textFieldFirstName.setVisible(false);
            Player player1 = new Player(firstName);

            labelSecondName.setText(secondName);
            textFieldSecondName.setVisible(false);
            Player player2 = new Player(firstName);
        }



    }
}


package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

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
    Button buttonStart;

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
}


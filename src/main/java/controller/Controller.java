package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.Game;
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
    Button buttonStart;

    @FXML
    TextField textFieldFirstSymbol;

    @FXML
    TextField textFieldSecondSymbol;

    @FXML
    Label labelFirstSymbol;

    @FXML
    Label labelSecondSymbol;

    String firstName;
    String secondName;

    Player player1;
    Player player2;

    @FXML
    public void onActionButtonExitMainScene(ActionEvent actionEvent) {
        System.exit(0);
    }

    @FXML
    public void onActionButtonNewMainScene(ActionEvent actionEvent) {
        firstName = textFieldFirstName.getText().trim();
        secondName = textFieldSecondName.getText().trim();

        if (firstName.isEmpty() || secondName.isEmpty()) {
            System.out.println("Name is Empty");
        } else if (firstName.equals(secondName)) {
            System.out.println("These are the same names.");
        } else {
            labelFirstName.setText(firstName);
            textFieldFirstName.setVisible(false);
            player1 = new Player(firstName);

            labelSecondName.setText(secondName);
            textFieldSecondName.setVisible(false);
            player2 = new Player(secondName);
            buttonStart.setVisible(true);
        }
    }

    @FXML
    public void onActionButtonStartMainScene(ActionEvent actionEvent) {
        String firstSymbol = textFieldFirstSymbol.getText().trim();
        String secondSymbol = textFieldSecondSymbol.getText().trim();

        if (firstSymbol.isEmpty() || secondSymbol.isEmpty()) {
            System.out.println("Empty symbols");
        } else if (firstSymbol.equals(secondSymbol)) {
            System.out.println("These are the same characters.");
        } else {
            labelFirstName.setText(firstName + " use a symbol: " + firstSymbol);
            labelFirstSymbol.setText("");
            textFieldFirstSymbol.setVisible(false);
            player1.setTypeKey(firstSymbol.charAt(0));

            labelSecondName.setText(secondName + " use a symbol: " + secondSymbol);
            labelSecondSymbol.setText("");
            textFieldSecondSymbol.setVisible(false);
            player2.setTypeKey(secondSymbol.charAt(0));

            Game gameFXML = new Game(player1, player2);

        }
    }
}


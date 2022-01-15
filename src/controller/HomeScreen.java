package controller;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class HomeScreen implements Initializable {
    public Label HomeScreenLabel;
    public Label ScratchPad;

    String currentValueString = "";
    int total = 0;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("I am initialized");
        HomeScreenLabel.setText(currentValueString);
    }

    public void onOneClicked(ActionEvent actionEvent) {
        currentValueString = currentValueString + "1";
        HomeScreenLabel.setText(currentValueString);
    }

    public void onTwoClicked(ActionEvent actionEvent) {
        currentValueString += "2";
        HomeScreenLabel.setText(currentValueString);
    }

    public void OnAddClicked(ActionEvent actionEvent) {
        total = total + Integer.valueOf(currentValueString);
        currentValueString = "";
        HomeScreenLabel.setText(String.valueOf(total));
    }
}

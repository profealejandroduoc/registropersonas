package cl.duoc.registropersonas.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PersonaController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}

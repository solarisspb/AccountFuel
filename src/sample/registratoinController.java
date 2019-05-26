package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class registratoinController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField firstName;

    @FXML
    private TextField secondName;

    @FXML
    private TextField login;

    @FXML
    private PasswordField password;

    @FXML
    private CheckBox checkAdmin;

    @FXML
    private CheckBox checkMechanic;

    @FXML
    private CheckBox checkManager;

    @FXML
    private Button undoButton;

    @FXML
    private Button saveButton;

    @FXML
    void initialize() {
        DatabaseHandler dbHandler = new DatabaseHandler();

        saveButton.setOnAction(event -> {
            dbHandler.registrationUser(firstName.getText(), secondName.getText(), login.getText(), password.getText(), "1", "0", "0");

        });


    }
}


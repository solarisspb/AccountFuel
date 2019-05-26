package sample;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class homeController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private MenuItem toolsDriver;

    @FXML
    private MenuItem toolsCar;

    @FXML
    private MenuItem toolsTracker;

    @FXML
    private MenuItem createUsers;

    @FXML
    private MenuItem referenceDriver;

    @FXML
    private MenuItem referenceCars;

    @FXML
    private MenuItem referenceTracker;

    @FXML
    private MenuItem fuelcontrol;

    @FXML
    private MenuItem users;

    @FXML
    private MenuItem reportsFuelAccount;

    @FXML
    void initialize() {

        createUsers.setOnAction(event -> {
            //createUsers.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/registration.fxml"));

            try{
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });


    }
}

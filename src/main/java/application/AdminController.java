package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminController {

    @FXML
    private void RegisterNutritionistClick(ActionEvent event) {
        switchScene(event, "Register_Nutritionist.fxml");
        
    }

    @FXML
    private void RegisterPatientClick(ActionEvent event) {
        switchScene(event, "Register_Patient.fxml");
    }

    private void switchScene(ActionEvent event, String fxmlFile) {
        try {
            Parent newScene = FXMLLoader.load(getClass().getResource(fxmlFile));
            Scene scene = new Scene(newScene);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
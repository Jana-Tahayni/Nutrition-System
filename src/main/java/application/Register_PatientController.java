package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

import java.net.URL;
import java.util.ResourceBundle;

public class Register_PatientController implements Initializable {

    @FXML
    private ComboBox<String> genderCombo;

    @FXML
    private ComboBox<String> goalCombo;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Define options for the gender ComboBox
        ObservableList<String> genderOptions = FXCollections.observableArrayList("Male", "Female");
        genderCombo.setItems(genderOptions);

        // Define options for the goal ComboBox
        ObservableList<String> goalOptions = FXCollections.observableArrayList("Weight Loss", "Weight Gain", "Life Style");
        goalCombo.setItems(goalOptions);
    }
    
}

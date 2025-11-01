package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

import java.net.URL;
import java.util.ResourceBundle;

public class Register_NutritionistController implements Initializable {

    @FXML
    private ComboBox<String> FieldCombo;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Define options for the ComboBox
        ObservableList<String> options = FXCollections.observableArrayList(
            "Weight Loss specialist",
            "Weight Gain specialist",
            "General health specialist"
        );
        // Set options to the ComboBox
        FieldCombo.setItems(options);
    }
}

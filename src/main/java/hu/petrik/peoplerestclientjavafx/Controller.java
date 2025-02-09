package hu.petrik.peoplerestclientjavafx;

import javafx.scene.control.Alert;

public abstract class Controller {

    protected void error(String headerText, String contentText) {
        alert(Alert.AlertType.ERROR, headerText, contentText);
    }

    protected void error(String headerText) {
        error(headerText, "");
    }

    protected void warning(String headerText) {
        alert(Alert.AlertType.ERROR, headerText, "");
    }

    protected void alert(Alert.AlertType alertType, String headerText, String contentText){
        Alert alert = new Alert(alertType);
        alert.setHeaderText(headerText);
        alert.setContentText(contentText);
        alert.showAndWait();
    }
}

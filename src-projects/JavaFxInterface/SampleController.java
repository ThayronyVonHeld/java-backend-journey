import javafx.fxml.FXML;
import javafx.scene.control.Alert;

public class SampleController {

    @FXML
    private void handleButton() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Mensagem");
        alert.setHeaderText(null);
        alert.setContentText("Botão clicado!");
        alert.showAndWait();
    }
}

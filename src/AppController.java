
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

public class AppController {

    @FXML
    private Button insertButton;

    @FXML
    private Button deleteButton;

    @FXML
    private Button updateButton;

    @FXML
    private Button importCSVButton;

    @FXML
    private Button importXMLButton;

    @FXML
    private Button importJSONButton;

    @FXML
    public void handleInsert() {
        // Kód pro zpracování události vkládání
        showAlert("Vložení", "Vkládání informace", "Zpracování vkládání informace.");
    }

    @FXML
    public void handleDelete() {
        // Kód pro zpracování události mazání
        showAlert("Smazání", "Mazání informace", "Zpracování mazání informace.");
    }

    @FXML
    public void handleUpdate() {
        // Kód pro zpracování události úpravy
        showAlert("Úprava", "Úprava informace", "Zpracování úpravy informace.");
    }

    @FXML
    public void handleImportCSV() {
        // Kód pro zpracování události importu CSV
        showAlert("Import CSV", "Import dat z CSV", "Zpracování importu dat z CSV.");
    }

    @FXML
    public void handleImportXML() {
        // Kód pro zpracování události importu XML
        showAlert("Import XML", "Import dat z XML", "Zpracování importu dat z XML.");
    }

    @FXML
    public void handleImportJSON() {
        // Kód pro zpracování události importu JSON
        showAlert("Import JSON", "Import dat z JSON", "Zpracování importu dat z JSON.");
    }

    private void showAlert(String title, String headerText, String contentText) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(headerText);
        alert.setContentText(contentText);
        alert.showAndWait();
    }
}

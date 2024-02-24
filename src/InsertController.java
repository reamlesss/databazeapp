import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class InsertController {

    String selectedTable;

    @FXML
    private MenuButton menuButton;

    @FXML
    private VBox oddeleniContainer;

    @FXML
    private VBox objednavkaContainer;

    @FXML
    private VBox zakaznikContainer;

    @FXML
    private VBox zamestnanecContainer;

    @FXML
    private VBox produktContainer;

    @FXML
    public void showOddeleniForm() {
        oddeleniContainer.setVisible(true);
        oddeleniContainer.setManaged(true);
    }

    @FXML
    void showObjednavkaForm() {
        objednavkaContainer.setVisible(true);
        objednavkaContainer.setManaged(true);
    }

    @FXML
    public void showZakaznikForm() {
        zakaznikContainer.setVisible(true);
        zakaznikContainer.setManaged(true);
    }

    @FXML
    public void showZamestnanecForm() {
        zamestnanecContainer.setVisible(true);
        zamestnanecContainer.setManaged(true);
    }

    @FXML
    public void showProduktForm() {
        produktContainer.setVisible(true);
        produktContainer.setManaged(true);
    }

    @FXML
    public void hideForms() {
        produktContainer.setVisible(false);
        produktContainer.setManaged(false);
        zamestnanecContainer.setVisible(false);
        zamestnanecContainer.setManaged(false);
        zakaznikContainer.setVisible(false);
        zakaznikContainer.setManaged(false);
        objednavkaContainer.setVisible(false);
        objednavkaContainer.setManaged(false);
        oddeleniContainer.setVisible(false);
        oddeleniContainer.setManaged(false);
    }

    @FXML
    private ChoiceBox<String> choiceBox;

    @FXML
    public void handleSelection() {
        String selectedTable = choiceBox.getValue();
        if (selectedTable != null) {
            switch (selectedTable) {
                case "Oddeleni":
                    hideForms();
                    showOddeleniForm();

                    break;
                case "Objednavka":
                    hideForms();
                    showObjednavkaForm();
                    break;
                case "Zakaznik":
                    hideForms();
                    showZakaznikForm();
                    break;
                case "Zamestnanec":
                    hideForms();
                    showZamestnanecForm();
                    break;
                case "Produkt":
                    hideForms();
                    showProduktForm();
                    break;
                default:
                    System.out.println("Není vybrána žádná akce.");
            }
        } else {
            System.out.println("Není vybrána žádná tabulka.");
            // Zde můžete zobrazit upozornění, že uživatel musí vybrat tabulku
        }
    }

    public void initialize() {
        choiceBox.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            // Call your method here
            handleSelection();
        });
    }

    public void connectToDB() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/obchod", "root",
                "trapovejgulas");
        // Statement statement = connection.createStatement();
        // ResultSet resultSet = statement.executeQuery("SELECT * FROM Objednavka");

    }

    @FXML
    private TextField oddeleniNazev;

    @FXML
    private TextField oddeleniPopis;

    @FXML
    public void addToOddeleni() {
        String nazev = oddeleniNazev.getText();
        String popis = oddeleniPopis.getText();

        if (!nazev.isEmpty() || !popis.isEmpty()) {
            
        } else if (nazev.isEmpty()) {
            oddeleniNazev.setText("You forgot to filll me!");

        } else if (popis.isEmpty()) {
            oddeleniPopis.setText("You forgot to fill me!");
        }
    }

    @FXML
    public void confirmSelection() {

    }
}

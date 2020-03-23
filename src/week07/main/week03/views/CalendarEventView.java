package week07.main.week03.views;

import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import week07.main.week02.models.CalendarEvent;

public class CalendarEventView implements View {

    private final VBox root;
    private final Button btnNieuw;
    private final Button btnVerwijderen;
    private final Button btnOverzicht;
    private final Button btnOpslaan;
    private final TextField textField;
    private final CheckBox checkBox;
    private final TextArea notitie;

    public CalendarEventView() {
        this.root = new VBox();


        GridPane gridPane = new GridPane();
        ColumnConstraints column1 = new ColumnConstraints();
        column1.setPercentWidth(20);
        gridPane.getColumnConstraints().add(column1);

        gridPane.setHgap(10);
        gridPane.setVgap(10);

        root.getChildren().add(gridPane);

        Label labelTitel = new Label("Titel");
        textField = new TextField();
        btnOpslaan = new Button("opslaan");
        btnOpslaan.maxWidth(btnOpslaan.getMaxWidth());

        Label labelMelding= new Label("Melding");
        checkBox = new CheckBox();

        Label labelNotitie = new Label("Notitie");
        notitie = new TextArea();

        gridPane.add(labelTitel, 0, 0);
        gridPane.add(textField, 1, 0);
        gridPane.add(labelMelding, 0, 1);
        gridPane.add(checkBox, 1, 1);
        gridPane.add(labelNotitie, 0, 2);
        gridPane.add(notitie, 1, 2);


        root.getChildren().add(btnOpslaan);

        HBox hBox = new HBox();

        btnNieuw = new Button("Nieuw");
        btnVerwijderen = new Button("Verwijderen");
        btnOverzicht = new Button("Terug naar overzicht");

        hBox.getChildren().add(btnNieuw);
        hBox.getChildren().add(btnVerwijderen);
        hBox.getChildren().add(btnOverzicht);

        root.getChildren().add(hBox);
    }

    @Override
    public Parent getRoot() {
        return root;
    }

    public Button getBtnNieuw() {
        return btnNieuw;
    }

    public Button getBtnVerwijderen() {
        return btnVerwijderen;
    }

    public Button getBtnOverzicht() {
        return btnOverzicht;
    }

    public Button getBtnOpslaan() {
        return btnOpslaan;
    }

    /**
     * Of je kiest ervoor om de validatie in de controller toe doen
     * Dat is de passieve View MVC implementatie
     */
    public void validateInputfields(){

        StringBuilder errortext = new StringBuilder("De volgende fouten zijn gevonden:\n"); // MAGIC number?
        boolean hasError = false;

        if(textField.getText().isEmpty()){
            hasError = true;
            textField.setStyle("-fx-border-color: red ; -fx-border-width: 2px ;");

            errortext.append("- Titel is verplicht\n");
        } else { // weer weghalen als goed
            textField.setStyle("");
        }

        if(notitie.getText().isEmpty()){
            hasError = true;
            notitie.setStyle("-fx-border-color: red ; -fx-border-width: 2px ;");

            errortext.append("- Notitie is verplicht\n");
        } else {
            notitie.setStyle("");
        }

        // hebben we een fout? Laten we dan maar een meding zien
        if(hasError){
            new Alert(Alert.AlertType.WARNING, errortext.toString()).show();
        }
    }

}

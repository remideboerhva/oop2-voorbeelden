package week07.main.week02.views;

import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import week07.main.week02.models.CalendarEvent;

public class CalendarEventView implements View{

    private final VBox root;

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
        TextField textField = new TextField();
        Button btnOpslaan = new Button("opslaan");
        btnOpslaan.maxWidth(btnOpslaan.getMaxWidth());

        Label labelMelding= new Label("Melding");
        CheckBox checkBox = new CheckBox();
        ListView<CalendarEvent> listView = new ListView<>();

        gridPane.add(labelTitel, 0, 0);
        gridPane.add(textField, 1, 0);
        gridPane.add(labelMelding, 0, 1);
        gridPane.add(checkBox, 1, 1);


        root.getChildren().add(btnOpslaan);
        root.getChildren().add(listView);

        HBox hBox = new HBox();

        Button btnNieuw = new Button("Nieuw");
        Button btnVerwijderen = new Button("Verwijderen");
        Button btnOverzicht = new Button("Terug naar overzicht");

        hBox.getChildren().add(btnNieuw);
        hBox.getChildren().add(btnVerwijderen);
        hBox.getChildren().add(btnOverzicht);

        root.getChildren().add(hBox);
    }

    @Override
    public Parent getRoot() {
        return root;
    }
}

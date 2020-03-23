package week07.main.week03.views;

import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

public class CalendarView implements View {

    private final GridPane root;
    private final Button btnNaarDetail;

    public CalendarView() {
        root = new GridPane();

        root.setHgap(10);
        root.setVgap(10);


        Label lbTitel = new Label("Titel");
        TextField txtTitel = new TextField();

        Label lbBeschrijving = new Label("Beschrijving");
        TextArea areaBeschijving = new TextArea();

        Label lbEventList = new Label("Events");
        ListView evenList = new ListView();
        btnNaarDetail = new Button("Naar detailscherm");

        root.add(lbTitel, 0,0);
        root.add(txtTitel, 1,0);
        root.add(lbBeschrijving, 0,1);
        root.add(areaBeschijving, 1,1);
        root.add(lbEventList, 0,2);
        root.add(evenList, 1,2);
        root.add(btnNaarDetail, 1, 3);

    }

    public Parent getRoot() {
        return root;
    }

    public Button getBtnNaarDetail() {
        return btnNaarDetail;
    }
}

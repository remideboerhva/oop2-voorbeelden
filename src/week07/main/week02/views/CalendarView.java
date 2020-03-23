package week07.main.week02.views;

import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import week07.main.week02.models.Calendar;

public class CalendarView implements View{

    private final GridPane root;

    public CalendarView() {

        Calendar calendar = new Calendar("Deze week", "Het lange beschrijving");

        root = new GridPane();

        root.setHgap(10);
        root.setVgap(10);


        Label lbTitel = new Label("Titel");
        TextField txtTitel = new TextField(calendar.getTitel());

        Label lbBeschrijving = new Label("Beschrijving");
        TextArea areaBeschijving = new TextArea(calendar.getBeschrijving());

        Label lbEventList = new Label("Events");
        ListView evenList = new ListView();

        root.add(lbTitel, 0,0);
        root.add(txtTitel, 1,0);
        root.add(lbBeschrijving, 0,1);
        root.add(areaBeschijving, 1,1);
        root.add(lbEventList, 0,2);
        root.add(evenList, 1,2);

    }

    public Parent getRoot() {
        return root;
    }
}

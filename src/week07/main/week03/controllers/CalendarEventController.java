package week07.main.week03.controllers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import week07.main.week03.MainApplication;
import week07.main.week03.models.CalendarEvent;
import week07.main.week03.views.CalendarEventView;
import week07.main.week03.views.View;

public class CalendarEventController extends Controller {

    private CalendarEventView view;
    private CalendarEvent event;

    public CalendarEventController(){
        this(null);
    }

    // detail meegeven
    public CalendarEventController(CalendarEvent event) {
        this.view = new CalendarEventView();
        this.event = event;

        // stap 4: geef alen knoppen een eventhandler
        Button btnOpslaan = view.getBtnOpslaan();

        btnOpslaan.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                // er moet gevalideerd worden
                view.validateInputfields();
//                new Alert(Alert.AlertType.INFORMATION, "OPSLAAN INGEDRUKT").show();
            }
        });

        view.getBtnNieuw().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                new Alert(Alert.AlertType.INFORMATION, "NIEUW INGEDRUKT").show();
            }
        });

        view.getBtnVerwijderen().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                new Alert(Alert.AlertType.INFORMATION, "VERWIJDEREN INGEDRUKT").show();
            }
        });

        view.getBtnOverzicht().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                // gebruik static in main
                MainApplication.switchController(new CalendarController());
            }
        });

    }

    @Override
    public View getView() {
        return this.view;
    }
}

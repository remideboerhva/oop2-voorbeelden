package week07.main.week03.controllers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import week07.main.week02.models.Calendar;
import week07.main.week03.MainApplication;
import week07.main.week03.views.CalendarView;
import week07.main.week03.views.View;

public class CalendarController extends Controller{

    private CalendarView view;
    private Calendar calendar;

    public CalendarController() {
        this.view = new CalendarView();

        view.getBtnNaarDetail().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                // gebruik static in main
                MainApplication.switchController(new CalendarEventController());
            }
        });
    }

    @Override
    public View getView() {
        return this.view;
    }
}

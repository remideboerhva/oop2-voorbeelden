package week07.main.week03;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import week07.main.week02.views.CalendarEventView;
import week07.main.week02.views.CalendarView;
import week07.main.week02.views.View;
import week07.main.week03.controllers.CalendarController;
import week07.main.week03.controllers.CalendarEventController;
import week07.main.week03.controllers.Controller;
import week07.main.week03.models.CalendarEvent;

;

/**
 * Verantwoordelijkheid: main screen management JavaFX app
 */
public class MainApplication extends Application {

    private static final String TITLE = "Practicumopdracht OOP2: Week 3 - Remi de Boer";
    private static final int WIDTH = 640;
    private static final int HEIGHT = 480;

    private static Stage stage;

    @Override
    public void start(Stage stage) {
        MainApplication.stage = stage;

        stage.setTitle(TITLE);
        stage.setWidth(WIDTH);
        stage.setHeight(HEIGHT);

        switchController(new CalendarEventController());

    }

    public static void switchController(Controller controller){
        //  Polymorfisme!
        Parent root =  controller.getView().getRoot(); // haal Parent uit View klasse

        stage.setScene(new Scene(root));

        stage.show();

    }
}
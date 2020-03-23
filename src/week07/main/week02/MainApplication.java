package week07.main.week02;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import week07.main.week02.views.CalendarEventView;
import week07.main.week02.views.CalendarView;
import week07.main.week02.views.View;

;

/**
 * Verantwoordelijkheid: main screen management JavaFX app
 */
public class MainApplication extends Application {

    private static final String TITLE = "Practicumopdracht OOP2: Week 2- Remi de Boer";
    private static final int WIDTH = 640;
    private static final int HEIGHT = 480;

    private static Stage stage;

    @Override
    public void start(Stage stage) {
        MainApplication.stage = stage;

        stage.setTitle(TITLE);
        stage.setWidth(WIDTH);
        stage.setHeight(HEIGHT);


        // Dit verplaats naar de controllers in week 3
        boolean showDetail = false;
        View view = showDetail ? new CalendarEventView() : new CalendarView();


        //  Polymorfisme!
        Parent root =  view.getRoot(); // haal Parent uit View klasse

        stage.setScene(new Scene(root));

        stage.show();
    }
}
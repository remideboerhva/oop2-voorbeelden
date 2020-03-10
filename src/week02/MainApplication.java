package week02;

import javafx.application.Application;
import javafx.stage.Stage;
import week02.models.WeekModel;

/**
 *
 */
public class MainApplication extends Application {

    private static String TITEL = "DE TITEL";
    private static int HEIGHT = 400;
    private static int WIDTH = 600;


    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("IN START");

        primaryStage.setTitle(TITEL);
        primaryStage.setWidth(WIDTH);
        primaryStage.setHeight(HEIGHT);

        WeekModel model = new WeekModel("Model tekst");

        MasterController masterController = new MasterController(primaryStage, model);
    }
}

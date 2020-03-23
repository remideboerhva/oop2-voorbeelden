package week07.main.week01;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainApplication extends Application {

    private static final String TITLE = "Practicumopdracht OOP2: Week 1- Remi de Boer";
    private static final int WIDTH = 640;
    private static final int HEIGHT = 480;

    private static Stage stage;

    @Override
    public void start(Stage stage) {
        MainApplication.stage = stage;

        stage.setTitle(TITLE);
        stage.setWidth(WIDTH);
        stage.setHeight(HEIGHT);
        VBox root = new VBox();

        root.setAlignment(Pos.CENTER);
        root.setSpacing(50);

        root.getChildren().add(new Button("Klik mij!"));

        stage.setScene(new Scene(root));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    } // wordt in week 2 apart gezet
}
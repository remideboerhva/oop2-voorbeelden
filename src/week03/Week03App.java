package week03;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Week03App extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        MainController mainController = new MainController();
        MainView mainView =  mainController.getView();

        Scene scene = new Scene(mainView.getRoot(), 600, 400);

        stage.setScene(scene);
        stage.show();
    }
}

package week04.altswitchcontroller;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import week04.altswitchcontroller.controllers.BestellingController;
import week04.altswitchcontroller.controllers.Controller;
import week04.altswitchcontroller.controllers.ProductController;

public class RepoApp extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {

        BestellingController bestellingController = new BestellingController(primaryStage);

        primaryStage.setScene(new Scene(bestellingController.getView().getRoot(), bestellingController.getView().getWidth(), bestellingController.getView().getHeight()));
        primaryStage.show();
    }

}

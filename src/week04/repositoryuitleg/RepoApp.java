package week04.repositoryuitleg;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import week04.repositoryuitleg.controllers.BestellingController;
import week04.repositoryuitleg.controllers.Controller;
import week04.repositoryuitleg.controllers.ProductController;

public class RepoApp extends Application {

    private static final String TITLE = "Repository Uitleg";
    private static final int HEIGHT = 600;
    private static final int WIDTH = 800;
    private static Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        BestellingController bestellingController = new BestellingController();

        stage.setScene(new Scene(bestellingController.getView().getRoot(), WIDTH, HEIGHT));
        stage.show();
    }

    public static void switchController(Controller controller){
        stage.setScene(new Scene(controller.getView().getRoot(), WIDTH, HEIGHT));
    }

    // of beter: als je deze klasse al MainController ziet dan zou dit netter zijn

    public static void switchToBestellingScherm(){
        BestellingController bestellingController = new BestellingController();
        stage.setScene(new Scene(bestellingController.getView().getRoot(), WIDTH, HEIGHT));
    }

    public static void switchToProductScherm(){
        ProductController productController = new ProductController();
        stage.setScene(new Scene(productController.getView().getRoot(), WIDTH, HEIGHT));
    }

}

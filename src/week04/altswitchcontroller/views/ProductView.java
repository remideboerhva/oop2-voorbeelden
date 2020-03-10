package week04.altswitchcontroller.views;

import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import week04.altswitchcontroller.RepoApp;
import week04.altswitchcontroller.controllers.ProductController;

/**
 * View verantwoordelijk voor het tonen en bewerken een producten
 */
public class ProductView implements View {

    private static final int HEIGHT = 400;
    private static final int WIDTH = 200;
    private final VBox root;
    private final ProductController controller;

    public ProductView(ProductController productController) {
        this.controller = productController;
        root = new VBox();
        root.setPadding(new Insets(10, 50, 50, 50));
        root.setSpacing(10);
        root.getChildren().add(new Label("We zijn er!!!"));

        Button btnTerug = new Button("TERUG");

        btnTerug.setOnAction( event -> {
//            RepoApp.switchController(new BestellingController());

            controller.switchToBestellingScherm();
        });

        this.root.getChildren().add(btnTerug);
    }


    @Override
    public Parent getRoot() {
        return this.root;
    }

    @Override
    public double getWidth() {
        return WIDTH;
    }

    @Override
    public double getHeight() {
        return HEIGHT;
    }
}

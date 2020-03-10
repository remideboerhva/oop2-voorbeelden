package week04.altswitchcontroller.controllers;

import javafx.scene.Scene;
import javafx.stage.Stage;
import week04.altswitchcontroller.views.ProductView;
import week04.altswitchcontroller.views.View;

public class ProductController implements Controller {

    private final ProductView rootView;
    private final Stage stage;

    public ProductController(Stage stage) {
        this.stage = stage;
        this.rootView = new ProductView(this);
    }

    @Override
    public View getView() {
        return this.rootView;
    }

    public void switchToBestellingScherm() {

        BestellingController bestellingController = new BestellingController(stage);
        View view = bestellingController.getView();

        stage.setScene(new Scene(bestellingController.getView().getRoot(), view.getWidth(), view.getHeight()));
    }
}

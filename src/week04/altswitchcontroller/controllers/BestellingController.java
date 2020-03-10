package week04.altswitchcontroller.controllers;

import javafx.scene.Scene;
import javafx.stage.Stage;
import week04.altswitchcontroller.RepoApp;
import week04.altswitchcontroller.views.BestellingView;
import week04.altswitchcontroller.views.View;

/**
 *
 */
public class BestellingController implements Controller {

    private final BestellingView view;
    private final Stage stage;

    public BestellingController(Stage stage) {
        this.stage = stage;
        this.view = new BestellingView(this);
    }

    @Override
    public View getView() {
        return view;
    }

    public void switchToProductScherm() {
        ProductController productController = new ProductController(stage);
        View view = productController.getView();

        stage.setScene(new Scene(productController.getView().getRoot(),
                view.getWidth(),
                view.getHeight()));
    }
}

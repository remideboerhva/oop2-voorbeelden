package week04.repositoryuitleg.views;

import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import week04.repositoryuitleg.RepoApp;
import week04.repositoryuitleg.controllers.BestellingController;

/**
 * View verantwoordelijk voor het tonen en bewerken een producten
 */
public class ProductView implements View {

    private final VBox root;

    public ProductView() {
        root = new VBox();
        root.setPadding(new Insets(10, 50, 50, 50));
        root.setSpacing(10);
        root.getChildren().add(new Label("We zijn er!!!"));

        Button btnTerug = new Button("TERUG");

        btnTerug.setOnAction( event -> {
//            RepoApp.switchController(new BestellingController());

            RepoApp.switchToBestellingScherm();
        });

        this.root.getChildren().add(btnTerug);
    }

    @Override
    public Parent getRoot() {
        return this.root;
    }
}

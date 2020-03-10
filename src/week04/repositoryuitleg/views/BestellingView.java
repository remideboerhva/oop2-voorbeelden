package week04.repositoryuitleg.views;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import week04.repositoryuitleg.RepoApp;
import week04.repositoryuitleg.controllers.ProductController;
import week04.repositoryuitleg.models.BestelRegel;
import week04.repositoryuitleg.models.Product;

public class BestellingView implements View {
    private GridPane rootView;
    private ObservableList<BestelRegel> bestelRegels = FXCollections.observableArrayList();

    public BestellingView() {
        initComboList();
        initializeGridPane();
        initFirstRow();
        initSecondRow();
        initThirdRow();

    }

    private void initThirdRow() {
        Button btnSwitchScreen = new Button("Wissel scherm");
        btnSwitchScreen.setOnAction(actionEvent -> {
//            RepoApp.switchController(new ProductController());

            RepoApp.switchToProductScherm();
        });
        rootView.add(btnSwitchScreen, 1, 2);
    }

    private void initFirstRow() {

        Label comboLabel = new Label("BestelRegels:");
        rootView.add(comboLabel, 0,0);
        ComboBox<BestelRegel> bestelRegelComboBox = new ComboBox<>(bestelRegels);
        bestelRegelComboBox.getSelectionModel().selectFirst();
        rootView.add(bestelRegelComboBox, 1, 0);
    }

    private void initSecondRow() {
        Button btnAdd = new Button("Voeg toe");

        btnAdd.setOnAction(event-> {
            bestelRegels.add(new BestelRegel(new Product("Ding", 5.0), 2));
        });

        rootView.add(btnAdd, 1,1);

    }

    private void initComboList() {
        bestelRegels.add(new BestelRegel(new Product("Ding", 5.0), 2));
        bestelRegels.add(new BestelRegel(new Product("Ander Ding", 5.0), 2));
    }

    private void initializeGridPane() {
        this.rootView = new GridPane();
        ColumnConstraints col1 = new ColumnConstraints();
        col1.setPercentWidth(25);
        ColumnConstraints col2 = new ColumnConstraints();
        col2.setPercentWidth(75);
        rootView.getColumnConstraints().addAll(col1,col2);

        rootView.setPadding(new Insets(10,10,10,10));
    }

    @Override
    public Parent getRoot() {
        return this.rootView;
    }
}

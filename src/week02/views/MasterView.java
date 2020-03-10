package week02.views;

import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Circle;
import practicumopdracht.ModelDetail;
import week02.MasterController;

import java.time.LocalDate;

/**
 * Doel: presentatie zaken
 */
public class MasterView implements View {

    private final MasterController masterController;
    private GridPane grid;

    public MasterView(MasterController masterController) {
        this.masterController = masterController;
        grid = new GridPane();
        grid.setGridLinesVisible(true);

        // masterController.getModelModel().getNaam()
        Label label = new Label("TEST");

        DatePicker datePicker = new DatePicker();
        TextField textField = new TextField("TEST");
        Circle circle = new Circle(5,5,50);
        Button btnSchermWissel = new Button("Naar detailscherm");

        btnSchermWissel.setOnAction(actionEvent -> {
            masterController.gotToDetailView(new ModelDetail(LocalDate.now(),true));
        });


        grid.add(label, 0, 0);
        grid.add(datePicker, 5, 5);
        grid.add(textField, 3,4);
        grid.add(circle, 1,2);

        grid.add(btnSchermWissel, 5, 2);
    }

    @Override
    public Parent getRoot() {
        return grid;
    }
}

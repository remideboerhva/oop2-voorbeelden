package week03;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;

public class MainView {

    /**
     * De hoofdcontainer waar de alle widgets in plaatsen
     */
    private final VBox root;

    private final Circle circle;
    private final MainController mainController;

    public MainView(MainController mainController) {
        this.mainController = mainController;

        this.root = new VBox();
        HBox vBox = new HBox();

        circle = new Circle(mainController.getRadius(), 50, 50);
        Button btnIncrement = new Button("Vergroot");
        Button btnDecrement = new Button("Verklein");
        Button btnReset = new Button("Reset");

        btnIncrement.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                circle.setRadius(mainController.getIncrementedRadius());
            }
        });

        btnDecrement.setOnAction(actionEvent -> circle.setRadius(mainController.getDecrementedRadius()));
        btnReset.setOnAction(actionEvent -> circle.setRadius(mainController.getReset()));

        vBox.getChildren().add(btnIncrement);
        vBox.getChildren().add(btnDecrement);
        vBox.getChildren().add(btnReset);
        root.getChildren().add(vBox);
        root.getChildren().add(circle);

    }

    /**
     * Geeft de hoofdcontainer van de View terug
     * @return
     */
    public Parent getRoot() {
        return root;
    }

    public void setRadius(int radius) {
        circle.setRadius(radius);
    }


    class Handler implements EventHandler{

        @Override
        public void handle(Event event) {

        }
    }

}

package week02.views;

import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class Week02bView implements View {

    private HBox hBox;

    public Week02bView() {
        this.hBox = new HBox();

        Button button = new Button("KLIK MIJ!");

        this.hBox.getChildren().add(button);

    }

    @Override
    public Parent getRoot() {
        return hBox;
    }
}

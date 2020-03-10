package practicumopdracht;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Practicumopdracht OOP2 - <naam>");

        // Lijkt op het idee van de DOM in HTML!
        VBox root = new VBox();
        HBox hBox = new HBox();
        root.setAlignment(Pos.CENTER);
        root.setSpacing(50);
        Scene scene  = new Scene(root, 200, 200);
        Button btnMaakModel = new Button("Maak Model aan");
        Button btnMaakDetail = new Button("Maak Detail aan");

        EventHandler handler = new KnoppenKlikker("De Boodschap");

        // net zoals eventlistener
        btnMaakModel.setOnAction(handler);


        btnMaakDetail.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Er is zowaar op mij geklikt");
            }
        });


        stage.setScene(scene);
        hBox.getChildren().add(btnMaakDetail);
        hBox.getChildren().add(btnMaakModel);
        root.getChildren().add(hBox);


        stage.setWidth(640);
        stage.setHeight(480);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

class KnoppenKlikker implements EventHandler<ActionEvent>{

    private String boodschap;

    public KnoppenKlikker(String boodschap) {
        this.boodschap = boodschap;
    }

    @Override
    public void handle(ActionEvent event) {
        System.out.println("Er is ook op mij geklikt: " + boodschap);
    }
}


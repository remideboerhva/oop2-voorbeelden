package week02;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import practicumopdracht.ModelDetail;

public class DetailController {
    private final MasterController masterController     ;
    private final Stage stage   ;
    private ModelDetail detail;

    public DetailController(MasterController masterController, Stage stage, ModelDetail detail) {
        this.masterController = masterController;
        this.stage = stage;
        this.detail = detail;

        VBox vBox = new VBox();
        Label dateLabel = new Label(detail.getAanmaakDatum().toString());
        Label gelezenLabel = new Label(String.valueOf(detail.isGelezen()));

        vBox.getChildren().add(dateLabel);
        vBox.getChildren().add(gelezenLabel);
        Scene scene = new Scene(vBox, 300, 600);

        stage.setScene(scene);
        stage.show();
    }

    public DetailController(MasterController masterController, Stage stage) {
        this(masterController, stage, null);
    }

    public void showDetail(ModelDetail modelDetail) {
        // instellen
        stage.show();
    }
}

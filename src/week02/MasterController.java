package week02;

import javafx.scene.Scene;
import javafx.stage.Stage;
import practicumopdracht.ModelDetail;
import practicumopdracht.ModelMaster;
import week02.models.WeekModel;
import week02.views.MasterView;

public class MasterController {

    private final Stage stage;
    private final MasterView view;
    private final Scene scene;
    private final ModelMaster model;
    private DetailController detailController;
    // moet feitelijk een stage hebben waarin een view zijn

    public MasterController(Stage primaryStage, WeekModel model) {
        this.stage = primaryStage;
        this.view = new MasterView(this);
        this.model = new ModelMaster(1, "DE MASTER");

        // Controller taak, creeer de scene op basis view en stage
        scene = new Scene(view.getRoot());
        detailController = new DetailController(this, stage);
        stage.setScene(scene);
        stage.show();
    }

    public ModelMaster getModelModel() {
        return model;
    }

    public void gotToDetailView(ModelDetail modelDetail) {
//        detailController = new DetailController(this, stage, modelDetail);
        detailController.showDetail(modelDetail);
    }
}

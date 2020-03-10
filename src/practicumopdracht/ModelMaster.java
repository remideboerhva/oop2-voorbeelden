package practicumopdracht;

import java.util.ArrayList;
import java.util.List;

public class ModelMaster {

    private final int id;
    private final String naam;
    private final List<ModelDetail> detailList;
    private boolean actief;

    public ModelMaster(int id, String naam) {
        this.id = id;
        this.naam = naam;
        this.detailList = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNaam() {
        return naam;
    }

    public List<ModelDetail> getDetailList() {
        return detailList;
    }

    public boolean isActief() {
        return actief;
    }
}

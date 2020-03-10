package week04.dao;

import java.util.ArrayList;
import java.util.List;

/**
 * Tijdelijk in geheugen doen
 */
class ModelDAO implements DAO<Model> {

    private List<Model> modelList = new ArrayList<>();

    @Override
    public List<Model> getAll(){
        return modelList;
    }

    @Override
    public Model get(int id){

        Model model = findModelInList(id);
        return model;
    }

    @Override
    public void addOrUpdate(Model model){
        // eerste kijken of het model al bestaat
        Model updated = findModelInList(model.getId());
        // update als nodig
        if(updated == null) {
            save(model);
        } else {
            updated.setNaam(model.getNaam());
        }
    }

    @Override
    public void remove(Model model){
        modelList.remove(model);
    }

    /**
     * Helper Method omdat deze code twee keer gebruikt wordt
     * @param id
     * @return
     */
    private Model findModelInList(int id) {
        Model model = null; // als we niets vinden dan wordt deze null teruggeven
        // opzoeken juiste model
        for(Model tmp: modelList){
            if(tmp.getId() == id){
                model = tmp;
            }
        }
        return model;
    }

    @Override
    public void save(Model model){
        modelList.add(model);
    }

}

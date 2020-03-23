package week07.main.week05.data;

import week07.main.week04.models.Calendar;

import java.util.ArrayList;
import java.util.List;

public abstract class CalenderDAO implements DAO<Calendar> {

    protected List<Calendar> objects;

    public CalenderDAO() {
        this.objects = new ArrayList<>();
    }

    @Override
    public List<Calendar> getAll() {
        return objects;
    }

    @Override
    public Calendar get(int id) {

        Calendar ret = null;

        for(Calendar cal: objects){
            if(cal.getId() == id){
                ret = cal;
            }
        }

        return ret;
    }

    @Override
    public void addOrUpdate(Calendar object) {
        // als niet bestaat maak nieuw
        if(get(object.getId()) == null){
            objects.add(object);
        } else { // anders vervang
            get(object.getId()).setTitel(object.getTitel());
            get(object.getId()).setBeschrijving(object.getBeschrijving());

        }
    }

    @Override
    public void remove(Calendar object) {
        objects.remove(object);
    }

    @Override
    public abstract boolean save();

    @Override
    public abstract boolean load();
}

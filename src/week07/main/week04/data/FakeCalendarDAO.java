package week07.main.week04.data;

import week07.main.week04.models.Calendar;

public class FakeCalendarDAO extends CalenderDAO {

    @Override
    public boolean save() {
        return true;
    }

    @Override
    public boolean load() {

        objects.add(new Calendar());
        objects.add(new Calendar());

        return true;
    }
}

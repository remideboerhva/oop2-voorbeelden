package week07.main.week04.models;

public class Calendar {

    private int id;
    private String titel;
    private String beschrijving;


    public Calendar(int id, String titel, String beschrijving) {
        this.id = id;
        this.titel = titel;
        this.beschrijving = beschrijving;
    }

    public Calendar(String titel, String beschrijving) {
        this(0, titel, beschrijving);
    }

    public Calendar() {

    }

    public String getBeschrijving() {
        return beschrijving;
    }

    public String getTitel() {
        return titel;
    }

    public int getId() {
        return this.id;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public void setBeschrijving(String beschrijving) {
        this.beschrijving = beschrijving;
    }

    @Override
    public String toString() {
        return "Calendar{" +
                "id=" + id +
                ", titel='" + titel + '\'' +
                ", beschrijving='" + beschrijving + '\'' +
                '}';
    }
}

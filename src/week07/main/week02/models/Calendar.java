package week07.main.week02.models;

public class Calendar {

    private String titel;
    private String beschrijving;

    public Calendar(String titel, String beschrijving) {
        this.titel = titel;
        this.beschrijving = beschrijving;
    }

    public String getBeschrijving() {
        return beschrijving;
    }

    public String getTitel() {
        return titel;
    }
}

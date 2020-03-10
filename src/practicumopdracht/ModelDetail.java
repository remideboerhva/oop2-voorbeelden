package practicumopdracht;

import java.time.LocalDate;

public class ModelDetail {

    private final LocalDate aanmaakDatum; // bv geboortedatum
    private boolean gelezen;

    public ModelDetail(LocalDate aanmaakDatum, boolean gelezen) {
        this.aanmaakDatum = aanmaakDatum;
        this.gelezen = gelezen;
    }

    public LocalDate getAanmaakDatum() {
        return aanmaakDatum;
    }

    public boolean isGelezen() {
        return gelezen;
    }
}

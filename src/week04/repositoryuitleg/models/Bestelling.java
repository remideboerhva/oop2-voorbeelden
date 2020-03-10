package week04.repositoryuitleg.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Bestelling {

    private LocalDate bestelDatum;
    private boolean afgehandeld;
    private List<BestelRegel> bestelRegels;

    public Bestelling() {
        bestelDatum = LocalDate.now();
        bestelRegels = new ArrayList<>();
    }
}

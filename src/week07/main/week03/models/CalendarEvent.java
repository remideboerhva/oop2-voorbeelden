package week07.main.week03.models;

import java.time.LocalDate;

public class CalendarEvent {

    private Calendar calendar;
    private String notitie;
    private LocalDate startDatum;
    private double entreePrijs;
    private int maximumDeelnemers;
    private boolean isIndoor;


    public CalendarEvent(Calendar calendar, String notitie, LocalDate startDatum, double entreePrijs, int maximumDeelnemers, boolean isIndoor) {
        this.calendar = calendar;
        this.notitie = notitie;
        this.startDatum = startDatum;
        this.entreePrijs = entreePrijs;
        this.maximumDeelnemers = maximumDeelnemers;
        this.isIndoor = isIndoor;
    }
}

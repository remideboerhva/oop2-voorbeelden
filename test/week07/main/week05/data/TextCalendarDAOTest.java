package week07.main.week05.data;

import org.junit.jupiter.api.Test;
import week07.main.week04.models.Calendar;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Geen unit test maar intergratietest, omdat het externe systemen aan de unit test -> IO
 */
class TextCalendarDAOTest {

    // In principe geen goede unittest het test teveel zaken in 1 keer
    // maar voor snelheid nu zo gedaan.
    @Test
    void save() {
        TextCalendarDAO instance = new TextCalendarDAO();

        instance.addOrUpdate(new Calendar(1, "de eerste", "beschrijving 1"));
        instance.addOrUpdate(new Calendar(2, "de tweede", "beschrijving 2"));
        instance.addOrUpdate(new Calendar(3, "de derde", "beschrijving 3"));

        boolean hasSaved =  instance.save();

        try(Scanner scanner = new Scanner(new File("files/calendar.csv"))){

            String line1 = scanner.nextLine();
            String line2 = scanner.nextLine();
            String line3 = scanner.nextLine();

            assertEquals("1,de eerste,beschrijving 1", line1);
            assertEquals("2,de tweede,beschrijving 2", line2);
            assertEquals("3,de derde,beschrijving 3", line3);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            fail();
        } catch (Exception e){
            e.printStackTrace();
            fail();
        }

        // als we hier komen dan is het terecht dat de boolean op true staat
        assertTrue(hasSaved);

    }

    @Test
    void load() {
    }
}
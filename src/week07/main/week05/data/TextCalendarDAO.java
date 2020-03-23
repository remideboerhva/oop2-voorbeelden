package week07.main.week05.data;

import week07.main.week04.models.Calendar;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TextCalendarDAO extends CalenderDAO {

    public static final String FILES_CALENDAR_TEXT = "files/calendar.csv";

    @Override
    public boolean save() {
        // itereer over lijst en sla elk object als CSV op
        try(PrintWriter pw = new PrintWriter(new File(FILES_CALENDAR_TEXT))){

            for(Calendar cal: objects){
                pw.printf("%d,%s,%s\n", cal.getId(), cal.getTitel(), cal.getBeschrijving());
            }

            pw.flush();

        } catch (FileNotFoundException e) {
            return false;
        }
        return true;
    }

    /**
     *
     * @return false if loading fails, true if list is correctly loaded
     */
    @Override
    public boolean load() {
        File file = new File(FILES_CALENDAR_TEXT);
        try(Scanner scanner = new Scanner(file)) {
            //
            if(scanner.hasNextLine()){
                // object uit halen
                String[] parts = scanner
                        .nextLine()
                        .split(",");

                // check of we wel 3 delen hebben
                if(parts.length != 3){
                    throw new CalendarParseFormatException();
                } else {
                    objects.add(new Calendar(Integer.parseInt(parts[0]), parts[1], parts[2]));
                }

            }

        } catch (FileNotFoundException e) {
            return false;
        } catch (NumberFormatException ex){
            return false;
        } catch (CalendarParseFormatException ex){
            return false;
        }

        return true;
    }

    private class CalendarParseFormatException extends Throwable {
    }
}

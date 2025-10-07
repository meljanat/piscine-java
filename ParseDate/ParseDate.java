import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ParseDate {

    public static LocalDateTime parseIsoFormat(String stringDate) {
        if (stringDate == null || stringDate.isEmpty()) {
            return null;
        }
        return LocalDateTime.parse(stringDate);
    }

    public static LocalDate parseFullTextFormat(String stringDate) {
        if (stringDate == null || stringDate.isEmpty()) {
            return null;
        }
        return LocalDate.parse(stringDate);
    }

    public static LocalTime parseTimeFormat(String stringDate) {
        if (stringDate == null || stringDate.isEmpty()) {
            return null;
        }
        return LocalTime.parse(stringDate);
    }

}
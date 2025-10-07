import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ParseDate {

    public static LocalDateTime parseIsoFormat(String stringDate) {
        if (stringDate == null || stringDate.isEmpty()) {
            return null;
        }
        return LocalDateTime.parse(stringDate);
    }

    public static LocalDate parseFullTextFormat(String stringDate) {
        String[] parts = stringDate.split(" ");
        String dayOfWeek = parts[0].substring(0, 1).toUpperCase() + parts[0].substring(1).toLowerCase();
        String day = parts[1];
        String month = parts[2].substring(0, 1).toUpperCase() + parts[2].substring(1).toLowerCase();
        String year = parts[3];
        String normalized = String.format("%s %s %s", day, month, year);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.ENGLISH);
        return LocalDate.parse(normalized, formatter);
    }

    public static LocalTime parseTimeFormat(String stringDate) {
        int hour = Integer.parseInt(stringDate.substring(0, 2));
        if (stringDate.contains("evening")) {
            if (hour < 12)
                hour += 12;
        }

        String[] timeParts = stringDate.split(", ");
        int minute = Integer.parseInt(timeParts[1].split(" ")[0]);
        int second = Integer.parseInt(timeParts[1].split("and ")[1].split(" ")[0]);

        return LocalTime.of(hour, minute, second);
    }

}
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDates {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(formatter.format(now));
        formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(formatter.format(now));
        formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        System.out.println(formatter.format(now));
        formatter = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy");
        System.out.println(formatter.format(now));
        formatter = DateTimeFormatter.ofPattern("h:mm 'on' dd-MMM-yyyy");
        System.out.println(formatter.format(now));
    }
}

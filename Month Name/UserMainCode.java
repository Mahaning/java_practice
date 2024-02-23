import java.time.*;
import java.time.format.*;

class UserMainCode {
    public static String getMonthName(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy");
        LocalDate localDate = LocalDate.parse(date, formatter);
        return localDate.getMonth().name();
    }
}
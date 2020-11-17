import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat test = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(test.format(calendar.getTime()));
        System.out.println(LocalDateTime.now());
    }
}

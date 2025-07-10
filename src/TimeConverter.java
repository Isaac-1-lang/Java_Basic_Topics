import java.time.LocalTime;
import java.time.Duration;
import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter time (HH:mm:ss): ");
        String timeStr = sc.nextLine();

        // Parse user input
        LocalTime inputTime = LocalTime.parse(timeStr);

        // Get duration from midnight to that time
        Duration duration = Duration.between(LocalTime.MIDNIGHT, inputTime);

        long totalSeconds = duration.getSeconds();
        long totalMinutes = totalSeconds / 60;
        long totalHours = totalSeconds / 3600;
        double totalDays = totalSeconds / 86400.0;

        System.out.println("In seconds: " + totalSeconds);
        System.out.println("In minutes: " + totalMinutes);
        System.out.println("In hours: " + totalHours);
        System.out.println("In days: " + totalDays);

        sc.close();
    }
}

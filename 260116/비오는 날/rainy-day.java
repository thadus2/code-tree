import java.util.Scanner;
import java.util.Arrays; 

class Forecast {
    String date, day, weather;

    public Forecast(String date, String day, String weather) {
        this.date = date;
        this.day = day;
        this.weather = weather;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Forecast[] forecasts = new Forecast[n];

        for (int i = 0; i < n; i++) {
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();
            // Please write your code here.
            forecasts[i] = new Forecast(date, day, weather);
        }
        Arrays.sort(forecasts, (p1, p2) -> p1.date.compareTo(p2.date));

        for (int i = 0; i < n; i++) {
            if (forecasts[i].weather.equals("Rain")) {
                System.out.println(forecasts[i].date + " " + forecasts[i].day + " " + forecasts[i].weather);
                break;
            }
        }
    }
}
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String A = sc.next();
        // Please write your code here.
        int[] num_of_days = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (m1 > m2 || (m1 == m2 && d1 > d2)) {
            int tmp = m1; m1 = m2; m2 = tmp;
            tmp = d1; d1 = d2; d2 = tmp;
        }
        int total_day = 0;
        while (true) {
            if (d1 == d2 && m1 == m2)
                break;
            total_day++;
            d1++;
            if (d1 > num_of_days[m1 - 1]){
                d1 = 1;
                m1++;
            }
        }
        String[] days = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        int day_freq = total_day / 7;
        if (Arrays.asList(days).indexOf(A) <= (total_day % 7))
            day_freq++;
        System.out.println(day_freq);
    }
}

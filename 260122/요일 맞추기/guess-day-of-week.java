import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        // Please write your code here.
        int[] num_of_days = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        boolean flag = true;
        if (m1 > m2 || (m1 == m2 && d1 > d2)) {
            int tmp = m1; m1 = m2; m2 = tmp;
            tmp = d1; d1 = d2; d2 = tmp;
            flag = false;
        }
        int total_day = 0;
        while (true) {
            if (d1 == d2 && m1 == m2)
                break;
            total_day++;
            d1++;
            if (d1 > num_of_days[m1 + 1]){
                d1 = 1;
                m1++;
            }
        }
        String[] days = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        String[] days_rev = new String[] {"Mon", "Sun", "Sat", "Fri", "Thu", "Wed", "Tue"};
        if (flag)
            System.out.println(days[total_day % 7]);
        else
            System.out.println(days_rev[total_day % 7]);
    }
}

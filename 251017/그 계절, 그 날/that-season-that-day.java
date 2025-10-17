import java.util.Scanner;
public class Main {
    private static void checkSeason(int y, int m, int d) {
        if (m == 12 || m == 1) {
            if (isExist(m, d))
                System.out.println("Winter");
        }
        else if (m == 2) {
            if ((d == 29 && isLeap(y)) || (d != 29 && isExist(m, d)))
                System.out.println("Winter");                
        }
        else if ((m == 3 || m == 4 || m == 5) && isExist(m, d))
            System.out.println("Spring");
        else if ((m == 6 || m == 7 || m == 8) && isExist(m, d))
            System.out.println("Summer");
        else if ((m == 9 || m == 10 || m == 11) && isExist(m, d))
            System.out.println("Fall");
        else
            System.out.println(-1);
    }
    private static boolean isLeap(int n) {
        if (n % 100 == 0 && n % 400 != 0)
            return false;
        else if (n % 4 == 0)
            return true;
        return false;
    }
    private static boolean isExist(int m, int d) {
        if (m < 1 || m > 12)
            return false;
        if (m == 2)
            if (d > 0 && d < 29)
                return true;
            else
                return false;
        if (m % 2 == 0) {
            if (m < 8 && d > 0 && d < 31)
                return true;
            else if (m >= 8 && d > 0 && d <= 31)
                return true;
        }
        else {
            if (m < 8 && d > 0 && d <= 31)
                return true;
            else if (m >= 8 && d > 0 && d < 31)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.
        checkSeason(y, m, d);
    }
}
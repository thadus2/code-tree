import java.util.Scanner;
public class Main {
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
        int m = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.
        if (isExist(m, d))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
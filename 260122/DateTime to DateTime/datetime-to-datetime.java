import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        // Please write your code here.
        int start_time = (A * 24 * 60) + (B * 60) + C;
        int end_time = (11 * 24 * 60) + (11 * 60) + 11;
        int diff = start_time - end_time;
        if (diff < 0) {
            System.out.println(-1);
            return;
        }
        System.out.println(diff);
    }
}
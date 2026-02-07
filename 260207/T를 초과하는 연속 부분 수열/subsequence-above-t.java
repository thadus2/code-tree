import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int num;
        int max = 1;
        int curr = 0;
        for (int i = 0; i < n; i++) {
            num = sc.nextInt();
            if (num > t)
                curr++;
            else
                curr = 0;
            if (max < curr)
                max = curr;
        }
        // Please write your code here.
        System.out.println(max);
    }
}
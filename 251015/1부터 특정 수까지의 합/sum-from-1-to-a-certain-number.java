import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        // Please write your code here.
        for (int i = 0; i < (n + 1); i ++) {
            sum += i;
        }
        System.out.println(sum / 10);
    }
}
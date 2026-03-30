import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int line[] = new int[105];
        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();

            line[start]++;
            line[end + 1]--;
        }
        // Please write your code here.
        int max = 0;
        for (int i = 1; i < 100; i++) {
            line[i] += line[i - 1];
            if (line[i] > max)
                max = line[i];
        }
        System.out.println(max);
    }
}
import java.util.Scanner;
public class Main {
    public static final int OFFSET = 100;

    public static final int MAX_SIZE = 220;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int line[] = new int[MAX_SIZE];
        int min = 0;
        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt() + OFFSET;
            int x2 = sc.nextInt() + OFFSET;

            line[x1] += 1;
            line[x2] -= 1;
        }
        // Please write your code here.
        int max = line[0];
        
        for (int i = 1; i < 205; i++) {
            line[i] += line[i - 1];

            if (line[i] > max)
                max = line[i];
        }
        
        System.out.println(max);
    }
}
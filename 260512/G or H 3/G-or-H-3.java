import java.util.Scanner;
public class Main {
    private static int MAX_SIZE = 10001;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        char[] photo = new char[MAX_SIZE];
        for (int i = 0; i < n; i++) {
            int pos = sc.nextInt();
            char c = sc.next().charAt(0);
            photo[pos] = c;
        }
        // Please write your code here.
        int max = 0;
        for (int i = 1; i < MAX_SIZE - k; i++) {
            int curr_sum = 0;
            for (int j = i; j < i + k + 1; j++) {
                if (photo[j] == 'G')
                    curr_sum += 1;
                else if (photo[j] == 'H')
                    curr_sum += 2;
            }
            if (max < curr_sum)
                max = curr_sum;
        }
        System.out.println(max);
    }
}
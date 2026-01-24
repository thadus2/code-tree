import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 
        int b = sc.nextInt(); 

        int[] res = new int[20];
        int idx = 0;

        while (n > 0) {
            res[idx++] = n % b;
            n /= b;
        }

        for (int i = idx - 1; i >= 0; i--) {
            System.out.print(res[i]);
        }
    }
}

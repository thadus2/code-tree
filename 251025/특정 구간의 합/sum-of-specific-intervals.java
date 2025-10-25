import java.util.Scanner;

public class Main {
    
    static int n, m;
    static int[] prefixSum; 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        prefixSum = new int[n + 1]; 
        prefixSum[0] = 0; 

        for (int i = 1; i <= n; i++) {
            int num = sc.nextInt();
            prefixSum[i] = prefixSum[i - 1] + num;
        }

        for (int i = 0; i < m; i++) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();

            int sum = prefixSum[a2] - prefixSum[a1 - 1];
            System.out.println(sum);
        }
    }
}
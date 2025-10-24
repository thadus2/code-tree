import java.util.Scanner;

public class Main {
    public static int sum;

    private static void func(int a[], int m) {
        while (m >= 1) {
            sum += a[m];
            if (m % 2 == 0)
                m /= 2;
            else
                m -= 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        func(arr, m);
        System.out.println(sum);
    }
}
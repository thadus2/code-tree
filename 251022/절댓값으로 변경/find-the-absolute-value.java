import java.util.Scanner;

public class Main {
    private static void abs(int a[]) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0)
                a[i] *= -1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        abs(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
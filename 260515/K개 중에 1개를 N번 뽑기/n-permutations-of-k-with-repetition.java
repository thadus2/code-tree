import java.util.Scanner;

public class Main {
    private static void choose(int[] arr, int index, int k, int n) {
        if (index == n) {
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i < k + 1; i++) {
            arr[index] = i;
            choose(arr, index + 1, k, n);
        }

        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        // Please write your code here.
        int[] arr = new int[n];
        choose(arr, 0, k, n);
    }
}
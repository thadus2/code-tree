import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int curr = 1;
        int max = 0;
        // Please write your code here.
        for (int i = 1; i < n; i++) {
            if (arr[i] > 0 && arr[i - 1] > 0 || arr[i] < 0 && arr[i - 1] < 0)
                curr++;
            else
                curr = 1;
            if (max < curr)
                max = curr;
        }

        System.out.print(max);
            
    }
}
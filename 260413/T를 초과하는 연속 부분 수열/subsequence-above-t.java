import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        int count = 0, max = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > t)
                count++;
            else
                count = 0;
            if (max < count)
                max = count;
        }
        System.out.println(max);
    }
}
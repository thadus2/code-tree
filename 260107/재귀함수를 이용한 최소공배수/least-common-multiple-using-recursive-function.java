import java.util.Scanner;

public class Main {
    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    private static int multiple(int[] arr, int n) {
        if (n == arr.length - 1) 
            return arr[n];

        int curr_mult = multiple(arr, n + 1);
        int curr_num = arr[n];

        return (int) ((long) curr_mult * curr_num / gcd(curr_mult, curr_num));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
            
        System.out.println(multiple(arr, 0));
    }
}
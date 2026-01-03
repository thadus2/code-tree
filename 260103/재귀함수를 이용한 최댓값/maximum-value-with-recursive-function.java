import java.util.Scanner;
public class Main {
    private static int findMax(int[] arr,int n) {
        if (n == arr.length - 1)
            return arr[n];
        int prev = findMax(arr, n + 1);
        if (arr[n] > prev)    
            return arr[n];
        else
            return prev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findMax(arr, 0));
        // Please write your code here.
    }
}
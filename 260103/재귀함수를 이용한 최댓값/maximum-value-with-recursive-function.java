import java.util.Scanner;
public class Main {
    private static int findMax(int[] arr,int n) {
        if (n == arr.length - 1)
            return arr[n];
        if (arr[n] > findMax(arr, n + 1))    
            return arr[n];
        else
            return findMax(arr, n + 1);
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
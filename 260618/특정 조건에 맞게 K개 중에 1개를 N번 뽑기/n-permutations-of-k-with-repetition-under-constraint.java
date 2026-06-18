import java.util.Scanner;
public class Main {
    private static int k;
    private static int n;
    private static int[] arr;
    private static int check = 1;
    private static void choose(int curr) {
        if (check == 2)
            return;
        if (curr >= n) {
            for (int i = 0; i < n; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
            return;
        }
        for (int i = 1; i < k + 1; i++) {
            arr[curr] = i;
            if (curr > 1) {
                if(arr[curr] == arr[curr - 1] && arr[curr - 1] == arr[curr - 2])
                    continue;
            }    
            choose(curr + 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        n = sc.nextInt();
        // Please write your code here.
        arr = new int[n];
        choose(0);
    }
}
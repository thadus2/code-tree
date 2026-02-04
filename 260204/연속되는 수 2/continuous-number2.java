import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int curr = 1;
        int max = 1;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (i > 0) {
                if (arr[i] == arr[i - 1]) {
                    curr++;
                    if (max <= curr) {
                        max = curr;
                    }
                }
                else { 
                    if (max <= curr) {
                        max = curr;
                    }
                    curr = 1;
                }
            }
        }
        // Please write your code here.
        System.out.println(max);
    }
}
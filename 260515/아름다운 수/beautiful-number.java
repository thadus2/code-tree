import java.util.Scanner;
public class Main {
    private static int pretty_num(int[] arr, int index, int n) {
        if (index == n) {
            for (int i = 0; i < n;) {
                int curr_count = 0;
                for (int j = i; j < i + arr[i]; j++) {
                    if (i + arr[i] > n)
                        return 0;
                    if (arr[i] == arr[j])  
                        curr_count++;
                }
                if (curr_count != arr[i])
                    return 0;
                i += arr[i];
            }
            return 1;
        }
        int sum = 0;
        for (int i = 1; i < 5; i++) {
            arr[index] = i;
            sum += pretty_num(arr, index + 1, n);
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        int[] arr = new int[n];
        System.out.println(pretty_num(arr, 0, n));
    }
}
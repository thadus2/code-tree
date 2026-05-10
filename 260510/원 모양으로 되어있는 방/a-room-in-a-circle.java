import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        int min = 99999999;
        for (int i = 0; i < n; i++) {
            int index = 0;
            int curr_sum = 0;
            while(index < n) {
                int curr_room = (i + index) % n;
                curr_sum += arr[curr_room] * index;
                index++;
            }
            if (curr_sum < min)
                min = curr_sum;
        }
        System.out.println(min);
    }
}
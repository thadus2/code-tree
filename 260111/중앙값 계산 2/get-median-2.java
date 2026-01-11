import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            if (i % 2 == 0) {
                int[] temp = Arrays.copyOfRange(arr, 0, i + 1);
                
                Arrays.sort(temp);
                
                System.out.print(temp[temp.length / 2] + " ");
            }
        }
    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] start = new int[n];
        int[] end = new int[n];
        int[] blocks = new int[100];
        for (int i = 0; i < n; i++) {
            start[i] = sc.nextInt();
            end[i] = sc.nextInt();
            for (int j = start[i] - 1; j < end[i]; j++)
                blocks[j]++; 
        }
        // Please write your code here.
        int max = 0;
        for (int i = 0; i < 100; i++){
            if (max < blocks[i])
                max = blocks[i];
        }
        System.out.println(max);
    }
}
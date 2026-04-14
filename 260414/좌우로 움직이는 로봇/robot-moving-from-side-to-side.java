import java.util.Scanner;

public class Main {
    private static final int OFFSET = 1000000;
    private static final int MAX_SIZE = 2 * OFFSET + 10;
    private static final int fillPosition(Scanner sc, int n, int[] arr) {
        int pos = OFFSET;
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);
            // Please write your code here.
            if (d == 'L') 
                while(t-- > 0) {
                    arr[pos] = arr[pos - 1] - 1;
                    pos++;
                }
            if (d == 'R')
                while(t-- > 0) {
                    arr[pos] = arr[pos - 1] + 1;
                    pos++;
                }
        }
        return pos;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] A = new int[MAX_SIZE];
        int a_pos = fillPosition(sc, n, A);
        int[] B = new int[MAX_SIZE];
        int b_pos = fillPosition(sc, m, B);
        
        // Please write your code here.
        while(a_pos < b_pos) {
            A[a_pos] = A[a_pos - 1];            
            a_pos++;
        }
        while(a_pos > b_pos) {
            B[b_pos] = B[b_pos - 1];            
            b_pos++;
        }
        int count = 0;
        for (int i = 1; i < a_pos; i++) {
            if (A[i - 1] != B[i - 1] && A[i] == B[i])
                count++;
        }
        System.out.println(count);
    }
}
import java.util.Scanner;

public class Main {
    private static final int OFFSET = 1000000;
    private static final int MAX_SIZE = 2 * OFFSET + 10;
    // private static final int 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] A = new int[MAX_SIZE];
        int a_pos = OFFSET;
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);
            // Please write your code here.
            if (d == 'L') 
                while(t-- > 0) {
                    A[a_pos] = A[a_pos - 1] - 1;
                    a_pos++;
                }
            if (d == 'R')
                while(t-- > 0) {
                    A[a_pos] = A[a_pos - 1] + 1;
                    a_pos++;
                }
        }
        int[] B = new int[MAX_SIZE];
        int b_pos = OFFSET;
        for (int i = 0; i < m; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);
            // Please write your code here.
            if (d == 'L') 
                while(t-- > 0) {
                    B[b_pos] = B[b_pos - 1] - 1;
                    b_pos++;
                }
            if (d == 'R')
                while(t-- > 0) {
                    B[b_pos] = B[b_pos - 1] + 1;
                    b_pos++;
                }
        }
        
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
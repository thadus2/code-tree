import java.util.Scanner;

public class Main {
    private static final int MAX_SIZE = 1000*1000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] A = new int[MAX_SIZE + 10];
        int a_pos = 1;
        for (int i = 0; i < n; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            while (t-- > 0) {
                A[a_pos] += A[a_pos - 1] + v;
                a_pos++;
            }
        }
        int[] B = new int[MAX_SIZE + 10];
        int b_pos = 1;
        for (int i = 0; i < m; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            while (t-- > 0) {
                B[b_pos] += B[b_pos - 1] + v;
                b_pos++;
            }
        }
        // Please write your code here.
        //0 = same, 1 = A, 2 = B 
        int head = 0;
        int count = 0;
        for (int i = 1; i < a_pos; i++) {
            if(head == 0)
                if (A[i] > B[i])
                    head = 1;
                else if(A[i] < B[i])
                    head = 2;
            if(head == 1 && A[i] < B[i]) {
                head = 2;
                count++;
            }
            else if(head == 2 && A[i] > B[i]) {
                head = 1;
                count++;
            }
            else if (A[i] == B[i]) {
                count++;
            }
        }
        System.out.println(count);
    }
}

// 1 2 4 6 8 10

// 1 2 3 10 15 20
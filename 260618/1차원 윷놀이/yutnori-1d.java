import java.util.Scanner;
public class Main {
    private static int[] piece;
    private static int[] turns;
    private static int max_score;
    private static int n;
    private static int m;
    private static int k;
    private static void yutnori(int curr, int curr_score) {
        if (curr >= n) {
            max_score = Math.max(max_score, curr_score);
            return;
        }

        for (int i = 0; i < k; i++) {
            if (piece[i] >= m) {
        yutnori(curr + 1, curr_score);
        } else {
            piece[i] += turns[curr];
            int next_score = curr_score;
            
            if (piece[i] >= m) {
                next_score++;
            }
            
            yutnori(curr + 1, next_score);
            
            piece[i] -= turns[curr];
        }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();
        piece = new int[k];
        turns = new int[n];
        for (int i = 0; i < k; i++) {
            piece[i] = 1; 
        }
        for (int i = 0; i < n; i++) {
            turns[i] = sc.nextInt();
        }
        // Please write your code here.
        yutnori(0, 0);
        System.out.println(max_score);
    }
}
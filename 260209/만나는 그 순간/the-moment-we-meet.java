import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();

        int pos = 0;
        A.add(pos);

        for (int i = 0; i < n; i++) {
            char d = sc.next().charAt(0);
            int t = sc.nextInt();
            for (int j = 0; j < t; j++) {
                pos += (d == 'R') ? 1 : -1;
                A.add(pos);
            }
        }

        pos = 0;
        B.add(pos);

        for (int i = 0; i < m; i++) {
            char d = sc.next().charAt(0);
            int t = sc.nextInt();
            for (int j = 0; j < t; j++) {
                pos += (d == 'R') ? 1 : -1;
                B.add(pos);
            }
        }

        int time = Math.min(A.size(), B.size());

        for (int i = 1; i < time; i++) {
            if (A.get(i).equals(B.get(i))) {
                System.out.println(i);
                return;
            }
        }

        System.out.println(-1);
    }
}

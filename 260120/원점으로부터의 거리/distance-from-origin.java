import java.util.Scanner;
import java.util.Arrays;

class Dot implements Comparable<Dot> {
    int dist, no;

    public Dot(int dist, int no) {
        this.dist = dist;
        this.no = no;
    }

    @Override
    public int compareTo(Dot dot) {
        if (this.dist == dot.dist)
            return this.no - dot.no;
        return this.dist - dot.dist;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Dot[] dots = new Dot[n];
        int[][] points = new int[n][2];
        for (int i = 0; i < n; i++) {
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
            dots[i] = new Dot((Math.abs(points[i][0]) + Math.abs(points[i][1])), (i + 1));
        }
        // Please write your code here.
        Arrays.sort(dots);
        for (int i = 0; i < n; i++) 
            System.out.println(dots[i].no);
    }
}
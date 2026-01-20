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
        int point1, point2;
        for (int i = 0; i < n; i++) {
            point1 = sc.nextInt();
            point2 = sc.nextInt();
            dots[i] = new Dot((Math.abs(point1) + Math.abs(point2)), (i + 1));
        }
        // Please write your code here.
        Arrays.sort(dots);
        for (int i = 0; i < n; i++) 
            System.out.println(dots[i].no);
    }
}
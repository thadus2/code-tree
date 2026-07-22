import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        // Please write your code here.
        int minArea = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            int minX = 40000, maxX = 0;
            int minY = 40000, maxY = 0;
            for (int j = 0; j < N; j++) {
                if (i == j)
                    continue;
                if (minX > x[j])
                    minX = x[j];
                if(maxX < x[j])
                    maxX = x[j];
                if(minY > y[j])
                    minY = y[j];
                if(maxY < y[j])
                    maxY = y[j];
            }
            int currArea = (maxX - minX) * (maxY - minY);
            if (currArea < minArea)
                minArea = currArea; 
        }
        System.out.println(minArea);
    }
}
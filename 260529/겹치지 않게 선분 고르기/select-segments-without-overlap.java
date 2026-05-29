import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    private static ArrayList<int[]> selected = new ArrayList<>();
    private static int[] checkLine = new int[1001];
    private static int max = 0;
    private static void selectLine(int[][] segments, int index) {
        if (index >= segments.length) {
            if (max < selected.size())
                max = selected.size();
            return;
        }
        for (int i = index; i < segments.length; i++) {
            if (selected.isEmpty()) {
                selected.add(segments[i]);
                int[] curr_line = segments[i];
                for (int j = curr_line[0]; j <= curr_line[1]; j++) {
                    checkLine[j]++;
                }
            }
            else {
                int[] curr_line = segments[i];
                for (int j = curr_line[0]; j <= curr_line[1]; j++) {
                    if (checkLine[j] == 1) {
                        selectLine(segments, index + 1);
                        return;
                    }
                }
                for (int j = curr_line[0]; j <= curr_line[1]; j++) {
                    checkLine[j]++;
                }
                selected.add(segments[i]);
                selectLine(segments, i + 1);
            }
                selectLine(segments, i + 1);
            selected.clear();
            for (int j = 0; j < 1001; j++) {
                checkLine[j] = 0;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] segments = new int[n][2];
        for (int i = 0; i < n; i++) {
            segments[i][0] = sc.nextInt();
            segments[i][1] = sc.nextInt();
        }
        // Please write your code here.
        selectLine(segments, 0);
        System.out.println(max);
    }
}
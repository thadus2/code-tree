import java.util.Scanner;
public class Main {
    private static int dfs(int[][] graph, int[] visited, int n, int vertex) {
        visited[vertex] = 1;
        int sum = 1;
        for (int i = 0; i < n; i++) {
                if (graph[vertex][i] >= 1 && visited[i] == 0) {
                    sum += dfs(graph, visited, n, i);
                }
            }
        return sum;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] graph = new int[n][n];
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;
            graph[u][v]++;
            graph[v][u]++;
        }
        // Please write your code here.
        int[] visited = new int[n];
        System.out.println(dfs(graph, visited, n, 0) - 1);
    }
}
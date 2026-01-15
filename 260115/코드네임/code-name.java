import java.util.Scanner;
class Agent {
    String codeName;
    int score;

    public Agent(String codeName, int score) {
        this.codeName = codeName;
        this.score = score;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Please write your code here.
        Agent[] agents = new Agent[5];
        int min = 101;
        int minNo = 0;
        for (int i = 0; i < 5; i++) {
            String codeName = sc.next();
            int score = sc.nextInt();
            if (min > score) {
                min = score;
                minNo = i;
            }
            agents[i] = new Agent(codeName, score);
        }
        Agent minAgent = agents[minNo];
        System.out.println(minAgent.codeName + " " + minAgent.score);
    }
}
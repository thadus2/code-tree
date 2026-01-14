import java.util.Scanner;

class User {
    String id;
    int level;

    public User() {
        id = "codetree";
        level = 10;
    }
    public User(String id, int level) {
        this.id = id;
        this.level = level;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int level = sc.nextInt();
        User user1 = new User();
        System.out.println("user " + user1.id + " lv " + user1.level);
        User user2 = new User("hello", 28);
        System.out.println("user " + user2.id + " lv " + user2.level);
        // Please write your code here.
    }
}
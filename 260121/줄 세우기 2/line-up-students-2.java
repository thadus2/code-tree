import java.util.Scanner;
import java.util.Arrays;

class Student implements Comparable<Student> {
    int height, weight, no;

    public Student(int height, int weight, int no) {
        this.height = height;
        this.weight = weight;
        this.no = no;
    }

    @Override
    public int compareTo(Student student) {
        if (this.height == student.height)
            return this.weight - student.weight;
        return this.height - student.height;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            int height = sc.nextInt();
            int weight = sc.nextInt();
            students[i] = new Student(height, weight, (i + 1));
        }

        Arrays.sort(students);

        for (int i = 0; i < n; i++) {
            System.out.println(students[i].height + " " + students[i].weight + " " + students[i].no);
        }
        // Please write your code here.
    }
}
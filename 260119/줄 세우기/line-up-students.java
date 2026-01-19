import java.util.Scanner;
import java.util.Arrays;

class Student implements Comparable<Student> {
    int h, w, num;

    public Student(int height, int weight, int num) {
        h = height;
        w = weight;
        this.num = num;
    }

    @Override
    public int compareTo(Student student) {
        if (this.h == student.h)
            return student.w - this.w;
        return student.h - this.h;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int height, weight;
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            height = sc.nextInt();
            weight = sc.nextInt();
            students[i] = new Student(height, weight, (i + 1));
        }
        Arrays.sort(students);

        for (int i = 0; i < n; i++) {
            System.out.println(students[i].h + " " + students[i].w + " " + students[i].num);
        }
        // Please write your code here.
    }
}
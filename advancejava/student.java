package advancejava;

import java.util.Arrays;
// import java.util.Comparator;

public class student {
    int marks;
    String name;

    student() {}

    student(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }

    // static class StudentComparator implements Comparator<student> {
    //     @Override
    //     public int compare(student s1, student s2) {
    //         return s1.marks - s2.marks; // ascending
    //         // return s2.marks - s1.marks; // descending
    //     }
    // }

    public static void main(String[] args) {
        student[] st = new student[3];
        st[0] = new student(85, "Aman");
        st[1] = new student(90, "Ravi");
        st[2] = new student(75, "Sita");

        // Arrays.sort(st, new StudentComparator());
        Arrays.sort(st, (s1, s2) -> s1.marks - s2.marks); // ascending
        for (student s : st) {
            System.out.println(s.marks + " " + s.name);
        }
    }
}

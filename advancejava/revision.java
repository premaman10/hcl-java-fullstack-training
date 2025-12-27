package advancejava;

import java.util.Arrays;

// import java.io.File;
class student implements Comparable<student>{
    int marks;
    String name;
    public student(int marks,String name){
         this.marks=marks;
            this.name=name;
    }
    public int compareTo(student s){
        return Integer.compare(this.marks, s.marks);//it wiill give us in ascending order
        // return Integer.compare(s.marks,this.marks);//it will give us in descending order
    } 
}


public class revision {
    public static void main(String[] args) {
        student[] students = new student[5];
        students[0] = new student(70,"A");
        students[1] = new student(90,"B");
        students[2] = new student(50,"C");
        students[3] = new student(80,"D");
        students[4] = new student(60,"E");
        Arrays.sort(students);
        for(int i=0;i<students.length;i++){
            System.out.println(students[i].name+" : "+students[i].marks);
        }
    }
}
package Mastery5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TD {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        Student s1 = new Student(1, "Somchai", "M",3.25);
        Student s2 = new Student(2, "Somchai", "M",3.9);
        Student s3 = new Student(3, "Somchai", "M",3.7);
        Student s4 = new Student(4, "Somchai", "M",3.8);
        Student s5 = new Student(5, "Somchai", "A",3.7);
        Student s6 = new Student(6, "Somchai", "Z",3.7);

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);

        Collections.sort(students, new MyComparator());
        Collections.reverse(students);
        for(Student s : students){
            System.out.println(s.id + ", " + s.firstName + ", " + s.nickName + ", " + s.cgpa);
        }


     }


}

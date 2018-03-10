package Mastery5;

import java.util.Comparator;

public class MyComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        char o1c = o1.nickName.charAt(0);
        char o2c = o2.nickName.charAt(0);
        if (o1c < o2c ){
            return -1;

        }
        else if (o1c > o2c){
            return 1;
        }
        else if (o1c == o2c){
            if (o1.cgpa < o2.cgpa){
                return -1;
            }
            else if (o1.cgpa > o2.cgpa){
                return 1;
            }
            else return 0;
        }


        return 0;
    }
}


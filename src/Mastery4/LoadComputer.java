package Mastery4;

import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class LoadComputer {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("computer.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Computer x= (Computer)ois.readObject();
            Computer y= (Computer)ois.readObject();

            ois.close();
            fis.close();

            System.out.println(x.price + " baht :" + x.hdd.size + " GB" + ", age=" + x.age);
            System.out.println(y.price + " baht :" + y.hdd.size + " GB" + ", age=" + y.age);


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

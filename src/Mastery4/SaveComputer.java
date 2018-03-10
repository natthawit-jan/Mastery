package Mastery4;

import java.io.*;
public class SaveComputer {

    public static void main(String[] args) {
        Computer c1 = new Computer(65000, 2017, new HardDrive(1024, 8000));
        Computer c2 = new Computer(30000, 2015, new HardDrive(512, 4000));
        System.out.println(c1.price + " baht :" + c1.hdd.size + " GB" + ", age=" + c1.age);
        System.out.println(c2.price + " baht :" + c2.hdd.size + " GB" + ", age=" + c2.age);

        try {
            FileOutputStream fos = new FileOutputStream("computer.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(c1);
            oos.writeObject(c2);
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}


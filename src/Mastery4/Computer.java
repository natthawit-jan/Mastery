package Mastery4;

import java.io.Serializable;

public class Computer implements Serializable {

    double price;
    int buildYear;
    transient int age ;
    HardDrive hdd;

    public Computer(double price, int buildYear, HardDrive hdd) {
        this.price = price;
        this.buildYear = buildYear;

        this.hdd = hdd;
         this.age = 2018-buildYear;
    }
}

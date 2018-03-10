package Mastery4;

import java.io.Serializable;

public class HardDrive  implements Serializable{
    int size;
    double price;

    public HardDrive(int size, double price) {
        this.size = size;
        this.price = price;
    }
}

package Mastery6;

import java.io.FileWriter;
import java.util.Scanner;

public class AddText  {
    public static void main(String[] args) {


        try

        {
            FileWriter file = new FileWriter("data.txt");
            Scanner sc = new Scanner(System.in);
            String tx = "";
            while (!tx.equals("==DONE==")) {
                System.out.print("Please type something:  ");
                tx = sc.nextLine();
                file.write(tx+"\n");


            }

            file.close();

        } catch(Exception ex ){
            ex.printStackTrace();
        }
    }
}

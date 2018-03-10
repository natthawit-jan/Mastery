package Mastery1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FreamTD extends JFrame{




    public FreamTD(){
        JButton b1 = new JButton("Down");
        JButton b2 = new JButton("Up");
        JButton b3= new JButton("Left");
        JButton b4 = new JButton("Right");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(BorderLayout.NORTH, b2);
        getContentPane().add(BorderLayout.SOUTH, b1);
        getContentPane().add(BorderLayout.WEST, b3);
        getContentPane().add(BorderLayout.EAST, b4);

        DrawPanal draw = new DrawPanal();

        add(BorderLayout.CENTER, draw);





        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println(e.getActionCommand());
                draw.y ++;

                draw.repaint();

            }

        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println(e.getActionCommand());
                draw.y--;

                draw.repaint();

            }

        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println(e.getActionCommand());
                draw.x--;

                draw.repaint();

            }

        });

        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println(e.getActionCommand());
                draw.x++;

                draw.repaint();

            }

        });






    }
    class DrawPanal extends JPanel {

        int x = 100; int y= 138;





        @Override
        protected void paintComponent(Graphics g) {
            int red = (int) (Math.random() * 255);
            int green = (int) (Math.random() * 255);
            int blue = (int) (Math.random() * 255);
            Color newCo = new Color(red, green, blue);

            g.setColor(newCo);


            g.fillOval(x, y, 50, 50);
            System.out.println(x + " " + y);;


        }



    }


    public static void main(String[] args) {
        FreamTD fream = new FreamTD();
        fream.setSize(400,400);



        fream.setVisible(true);



    }
}

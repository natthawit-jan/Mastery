package Mastery2;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class BounceBall {
    public JFrame fream;
    JPanel circle1;

    BounceBall() {
        fream = new JFrame("Bouncing Ball");
        fream.setSize(500, 500);
        fream.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




        circle1 = new MyPanal();

        fream.add(circle1);


    }

    void begin() {
        fream.setVisible(true);
        moveTheBall();
    }


    void moveTheBall() {
        while (true) {
            circle1.repaint();

        }
    }



    class MyPanal extends JPanel {

        private int x;
        private int y;
        private int x2;
        private int y2;


        private double dx = 1;

        private double dy = 1;

        private double dx2 = 1;

        private double dy2 = 1;

        MyPanal() {

            Random rn = new Random();

            this.x = rn.nextInt(fream.getWidth());
            this.y = rn.nextInt(fream.getHeight());
            this.x2 = rn.nextInt(fream.getWidth());
            this.y2 = rn.nextInt(fream.getHeight());




        }


        @Override
        protected void paintComponent(Graphics g) {

            getPosition(1);
            int r = (int) (Math.random() * 255);
            int gr = (int) (Math.random() * 255);
            int b = (int) (Math.random() * 255);
            g.setColor(new Color(r, gr, b));
            g.fillOval(x, y, 50, 50);

            r = (int) (Math.random() * 255);
            gr = (int) (Math.random() * 255);
            b = (int) (Math.random() * 255);


            g.setColor(new Color(r, gr, b));
            getPosition(2);

            g.fillOval(x2, y2, 50, 50);


        }

        void getPosition(int circle) {

            switch (circle) {

                case 1:
                    if (x < 0) dx = 1;
                    if (x >= getWidth() - fream.getX()) dx -= 1;
                    if (y < 0) dy = 1;

                    if (y >= getHeight() - fream.getY()) dy = -1;


                    x += dx;
                    y += dy;
                    break;

                case 2:
                    if (x2 < 0) dx2 = 1;
                    if (x2 >= getWidth() - fream.getX()) dx2 -= 1;
                    if (y2 < 0) dy2 = 1;

                    if (y2 >= getHeight() - fream.getY()) dy2 = -1;


                    x2 += dx2;
                    y2 += dy2;

            }


        }
    }

    public static void main(String[] args) {
        BounceBall beginGame = new BounceBall();
        beginGame.begin();

    }
}



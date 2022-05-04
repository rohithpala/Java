package Assignment3;

import java.awt.Canvas;
import java.awt.Graphics;
import java.util.Scanner;
import javax.swing.JFrame;

public class test extends Canvas {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        JFrame frame = new JFrame("My Drawing");
        Canvas canvas = new test();
        canvas.setSize(400, 400);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        g.fillOval(100, 100, 200, 200);
    }
}
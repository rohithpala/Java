package Assignment3;

import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;

public class DrawingShapes extends Canvas {
    public static void main(String[] args) {
        new DrawingShapes().Oval();
    }

    void Oval() {
        JFrame frame = new JFrame("My Drawing");
        Canvas canvas = new test();
        canvas.setSize(400, 400);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        g.fillOval(100, 100, 200, 200);
    }
}
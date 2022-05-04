package Assignment3;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Rectangle extends JPanel {
    public static void main(String[] a) {
        JFrame f = new JFrame();
        f.setSize(375, 350);
        f.add(new Rectangle());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(150, 100, 75, 50);
    }
}

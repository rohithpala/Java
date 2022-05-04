package Assignment3;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class test1 extends JFrame {
    boolean check = true;
    int x, y, w, h;

    public static void main(String[] args) {
        new test1().page();
    }

    void page() {
        Scanner input = new Scanner(System.in);
        System.out.print("X: ");
        x = input.nextInt();
        System.out.print("Y: ");
        y = input.nextInt();
        System.out.print("Width: ");
        w = input.nextInt();
        System.out.print("Height: ");
        h = input.nextInt();

        JFrame f = new JFrame();
        f.setLayout(new BorderLayout());
        f.setVisible(true);
        f.add(new JPanel());
        f.setSize(600, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.repaint();
    }
    public void paint (Graphics g){
        if (check) {
            g.setColor(Color.RED);
            g.fillRect(10, 10, 25, 30);
        }
    }
}

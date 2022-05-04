package Assignment3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawingShapesGUI {
	public static void main(String[] args){
		new DrawingShapesGUI().HomePage();
	}

	JFrame frame = new JFrame("Available Shapes");
	JPanel panel = new JPanel();
	JButton rectangle = new JButton("Rectangle");
	JButton circle = new JButton("Circle");
	JButton oval = new JButton("Oval");
	JButton cylinder = new JButton("Cylinder");
	JButton draw = new JButton("Draw");
	boolean check = false;

	JLabel x = new JLabel("x:");
	JLabel y = new JLabel("y:");
	JLabel width = new JLabel("Width:");
	JLabel height = new JLabel("Height:");
	JLabel errorMessage = new JLabel();

	JTextField xText = new JTextField();
	JTextField yText = new JTextField();
	JTextField widthText = new JTextField();
	JTextField heightText = new JTextField();

	void HomePage(){
		frame.setSize(600, 600);
		frame.setVisible(true);
		frame.setLayout(null);

		frame.add(panel);
		frame.add(rectangle);
		frame.add(circle);
		frame.add(oval);
		frame.add(cylinder);
		frame.add(x);
		frame.add(xText);
		frame.add(y);
		frame.add(yText);
		frame.add(width);
		frame.add(widthText);
		frame.add(height);
		frame.add(heightText);
		frame.add(draw);
		frame.add(errorMessage);

		rectangle.setBounds(200, 150, 200, 30);
		rectangle.addActionListener(new Rectangle());

		circle.setBounds(200, 210, 200, 30);
		circle.addActionListener(new Circle());

		oval.setBounds(200, 270, 200, 30);
		oval.addActionListener(new Oval());

		cylinder.setBounds(200, 330, 200, 30);
		cylinder.addActionListener(new Cylinder());

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	class Rectangle extends Canvas implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			Canvas canvas = new Rectangle();
			rectangle.setVisible(false);
			circle.setVisible(false);
			oval.setVisible(false);
			cylinder.setVisible(false);

			canvas.setSize(400, 400);
			frame.add(canvas);
			frame.pack();

			x.setBounds(200, 50, 100, 25);
			xText.setBounds(300, 50, 100, 25);

			y.setBounds(200, 100, 100, 25);
			yText.setBounds(300, 100, 100, 25);

			width.setBounds(200, 150, 100, 25);
			widthText.setBounds(300, 150, 100, 25);

			height.setBounds(200, 200, 100, 25);
			heightText.setBounds(300, 200, 100, 25);

			errorMessage.setBounds(230, 300, 150, 25);

			draw.addActionListener(new DrawRectangle());
			draw.setBounds(250, 250, 100, 25);
		}

		class DrawRectangle extends JComponent implements ActionListener{

			public void paintComponent(Graphics g){
				System.out.println("In paint");	// TODO: Not Working for null layout
				if (check){
					super.paintComponent(g);
				    frame.getContentPane().removeAll();
				    frame.repaint();
					System.out.println("In paint if");
					Graphics2D g2D = (Graphics2D) g;
					g2D.setColor(Color.BLACK);
					g2D.fillRect(Integer.parseInt(xText.getText()), Integer.parseInt(yText.getText()),
							Integer.parseInt(widthText.getText()), Integer.parseInt(heightText.getText()));
				}
			}

			@Override
			public void actionPerformed(ActionEvent e) {
				if (xText.getText().equals("") || yText.getText().equals("") || widthText.getText().equals("") || heightText.getText().equals("")) {
					errorMessage.setText("Please Fill All the Fields");
				} else {
					check = true;
					frame.setTitle("Rectangle");
					frame.getContentPane().removeAll();
					frame.repaint();
                    frame.setSize(600,600);

					frame.add(x);
                    frame.add(y);
                    frame.add(width);
                    frame.add(height);
                    frame.add(xText);
                    frame.add(yText);
                    frame.add(widthText);
                    frame.add(heightText);

					repaint();
				}
			}
		}
	}

	class Circle implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			rectangle.setVisible(false);
			circle.setVisible(false);
			oval.setVisible(false);
			cylinder.setVisible(false);

			frame.setTitle("Circle");
		}
	}

	class Oval implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			rectangle.setVisible(false);
			circle.setVisible(false);
			oval.setVisible(false);
			cylinder.setVisible(false);

			frame.setTitle("Oval");
		}
	}

	class Cylinder implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			rectangle.setVisible(false);
			circle.setVisible(false);
			oval.setVisible(false);
			cylinder.setVisible(false);

			frame.setTitle("Cylinder");
		}
	}
}

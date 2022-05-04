import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI extends JFrame implements ActionListener {
    JTextField jtf1, jtf2;
    JLabel jl1, jl2;
    JButton button;
    UI() {
        jtf1 = new JTextField(10);
        jtf2 = new JTextField(10);
        jl1 = new JLabel("Username: ");
        jl2 = new JLabel("Password: ");
        button = new JButton("Login");
        button.addActionListener(this);
        setLayout(new GridLayout(3, 2));
        add(jl1); add(jtf1); add(jl2); add(jtf2); add(button);
        setVisible(true);
        setSize(400, 400);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(jtf1.getText().equals("Rohith") && jtf2.getText().equals("123456")){
            System.out.println("Welcome");
        }else{
            System.out.println("Enter Correctly");
        }
    }

    public static void main(String[] args) {
        new UI();
    }
}

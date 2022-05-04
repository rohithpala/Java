package Week10And11;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginMVC {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JButton button = new JButton("Login");
    JLabel userLabel = new JLabel("Username:");
    JLabel passwordLabel = new JLabel("Password:");
    JLabel msg = new JLabel();
    JTextField userText = new JTextField();
    JTextField passwordText = new JTextField();

    public static void main(String[] args) {
        new LoginMVC().HomePage();
    }

    void HomePage() {
        frame.setSize(350, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setTitle("Login");
        frame.add(panel);
        frame.add(userLabel);
        frame.add(passwordLabel);
        frame.add(userText);
        frame.add(passwordText);
        frame.add(button);
        frame.add(msg);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        userLabel.setBounds(20, 50, 80, 25);
        passwordLabel.setBounds(20, 80, 80, 25);

        userText.setBounds(100, 50, 120, 25);
        passwordText.setBounds(100, 80, 120, 25);

        msg.setBounds(60, 150, 200, 25);

        button.setBounds(110, 120, 80, 25);
        button.addActionListener(new Login());
    }

    class Login implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if(userText.getText().equals("Rohith") && passwordText.getText().equals("123456"))
                msg.setText("LogIn Successful");
            else
                msg.setText("Wrong Credentials");
        }
    }
}

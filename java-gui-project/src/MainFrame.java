import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class MainFrame extends JFrame {
    final private Font mainFont = new Font("Poppins", Font.BOLD, 18);
    JTextField tfFirstName, tfLastName;
    String firstName, lastName;


    public void initialize(){
        // Form Panel
        JLabel lbFirstName, lbLastName;
        lbFirstName = new JLabel("First Name");
        lbFirstName.setFont(mainFont);
        lbLastName = new JLabel("Last Name");
        lbLastName.setFont(mainFont);

        tfFirstName = new JTextField();
        tfFirstName.setFont(mainFont);
        tfLastName = new JTextField();
        tfLastName.setFont(mainFont);

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4, 1, 5, 5));
        formPanel.add(lbFirstName);
        formPanel.add(tfFirstName);
        formPanel.add(lbLastName);
        formPanel.add(tfLastName);
        formPanel.setBorder(new EmptyBorder(0, 20, 0, 20));
        // Form Panel

        // Welcome
        JLabel lbWelcome = new JLabel("", SwingConstants.CENTER);
        lbWelcome.setFont(new Font("Poppins", Font.BOLD, 20 ));
        lbWelcome.setForeground(Color.WHITE);
        // Welcome
        
        // Button
        JButton buttonOk = new JButton("Okay");
        buttonOk.setFont(mainFont);
        buttonOk.addActionListener(e -> {
            firstName = tfFirstName.getText();
            lastName = tfLastName.getText();
            if(!Objects.equals(firstName, "") && !Objects.equals(lastName, "")) {
                lbWelcome.setText("<html><div style='text-center'>Welcome to Watch Mojo, " + firstName + " " + lastName + "</div></html>");
            } else {
                lbWelcome.setText("<html><div style='text-center'>Welcome to Watch Mojo</div></html>");
            }
        });
        
        JButton buttonClear = new JButton("Clear");
        buttonClear.setFont(mainFont);
        buttonClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfFirstName.setText("");
                tfLastName.setText("");
                lbWelcome.setText("");
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1,2,5,5));
        buttonPanel.add(buttonOk);
        buttonPanel.add(buttonClear);
        // Button 

        // Main Panel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(0,0,0));
        mainPanel.add(formPanel, BorderLayout.NORTH);
        mainPanel.add(lbWelcome, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);
        // Main Panel

        add(mainPanel);

        setTitle("Welcome");
        setSize(500, 600);
        setMinimumSize(new Dimension(300,400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        MainFrame myFrame = new MainFrame();
        myFrame.initialize();
    }
}

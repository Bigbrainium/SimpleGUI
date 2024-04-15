import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

    }

    public literallyMe = JFrame;
    public GUI() {
        // Create frame
        JFrame frame = new JFrame("SIGMA LIGMA");
        frame.setSize(2000,750);
        // Closes program when x is clicked
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Create panel
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(50,50,50,50));
        panel.setLayout(new GridLayout(4,1,150,150));
        frame.add(panel);

        // Create buttons
        JButton b1 = new JButton("Sigma");
        JButton b2 = new JButton("Ligma");
        JButton b3 = new JButton("I am literally Ayanokoji");

        panel.add(b1);
        panel.add(b2);
        panel.add(b3);

        literallyMe = new JLabel("so halal mode");
        literallyMe.setHorizontalAlignment(JLabel.CENTER);
        literallyMe.setText("I'm so sigma even Ayanokoji wants to be like me");

        panel.add(literallyMe);

        // Adding actions to buttons
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code that is run after button1 is pressed
                b1Press();
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code that is run after button2 is pressed
                b2Press();
            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code that is run after button3 is pressed
                b3Press();
            }
        });

        // Makes frame show up
        // should be last so everything shows up
        frame.setVisible(true);
        panel.setVisible(true);
        literallyMe.setVisible(true);

    }
}
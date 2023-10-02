import javax.swing.*;
import java.awt.*;

public class Main {
    private static JFrame frame;
    public static void main(String[] args) {

        frame = new JFrame();
        frame.setSize(new Dimension(500, 500));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(0,4,10,10));

        frame.add(new JLabel("Name (First, Last)"));
        frame.add(new JLabel("Status"));
        frame.add(new JLabel("Rank"));
        frame.add(new JLabel("Salary"));

        frame.setVisible(true);
    }
}
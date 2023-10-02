import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main {
    private static JFrame frame;
    private static JButton btnAdd;
    private static JButton btnDelete;
    public static void main(String[] args) {

        frame = new JFrame();
        frame.setSize(new Dimension(500, 500));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(0,4,10,10));

        btnAdd = new JButton("Add person");
        btnDelete = new JButton("Delete selected person");
        btnAdd.setSize(new Dimension(100, 30));
        btnDelete.setSize(new Dimension(100, 30));


        frame.add(btnAdd);
        frame.add(btnDelete);
        frame.add(new JLabel(""));
        frame.add(new JLabel(""));
        frame.add(new JLabel(""));



        frame.add(new JLabel("Name (First, Last)"));
        frame.add(new JLabel("Status"));
        frame.add(new JLabel("Rank"));
        frame.add(new JLabel("Occupation"));
        frame.add(new JLabel("Salary"));


        // let's add some default, dummy values
        ArrayList<Person> dummyPeople = new ArrayList<>();
        Professor dummyProf = new Professor("David Stotts", "123456789");

        for (int i = 1; i <= 50; i ++){
            frame.add(new JButton(Integer.toString(i)));
        }

        frame.setVisible(true);
    }
}
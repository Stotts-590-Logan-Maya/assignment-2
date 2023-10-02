import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Main {
    private static JFrame frame;
    private static JButton btnAdd;
    private static JButton btnDelete;
    public static void main(String[] args) {

        frame = new JFrame();
        frame.setSize(new Dimension(750, 500));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(0,4,10,10));

        btnAdd = new JButton("Add person");
        btnDelete = new JButton("Delete selected person");
        btnAdd.setSize(new Dimension(100, 30));
        btnDelete.setSize(new Dimension(100, 30));





        frame.add(btnAdd);
        frame.add(new JLabel(""));
        frame.add(new JLabel(""));
        frame.add(new JLabel(""));

        JLabel name = new JLabel("Name (First, Last)");
        JLabel ID = new JLabel("ID");
        JLabel occ = new JLabel("Occupation");
        JLabel sal = new JLabel("Salary");
        name.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        ID.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        occ.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        sal.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        frame.add(name);
        frame.add(ID);
        frame.add(occ);
        frame.add(sal);


        // let's add some default, dummy values
        ArrayList<Person> people = new ArrayList<>();
        Professor dummyProf = new Professor("Paul Stotts", "123456789", 155047);
        Student student1 = new Student("Logan Stach", "730489157", 0);
        Student student2 = new Student("Maya Agnahotri", "", 0);

        people.add(dummyProf);
        people.add(student1);
        people.add(student2);

        for (int i = 0; i < people.size(); i ++){
            Person person = people.get(i);
            frame.add(new JLabel(person.getName()));
            frame.add(new JLabel(person.getID()));

            if (person instanceof Professor){
                frame.add(new JLabel("Professor"));
            }
            else if (person instanceof Student){
                frame.add(new JLabel("Student"));
            }
            else if (person instanceof Employee){
                frame.add(new JLabel("Employee"));
            }

            frame.add(new JLabel("$" + Integer.toString(person.getSalary())));
        }

        frame.setVisible(true);


        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String toParse = JOptionPane.showInputDialog("Enter the info of the person in the following format, separating each value with a ',':\n" +
                        "first last,id,occupation,salary\n" +
                        "where occupation is either 'Student', 'Professor', or 'Employee' (note that students have salary = 0).");

                String[] arr = toParse.split(",");

                String name = arr[0];
                String id = arr[1];
                String occ = arr[2];
                int salary = Integer.parseInt(arr[3]);

                frame.add(new JLabel(name));
                frame.add(new JLabel(id));
                frame.add(new JLabel(occ));


                if (occ.equals("Professor")){
                    Professor prof = new Professor(name, id, salary);
                    people.add(prof);
                    frame.add(new JLabel(Integer.toString(salary)));
                } else if (occ.equals("Student")) {
                    Student stud = new Student(name, id, salary);
                    people.add(stud);
                    frame.add(new JLabel("0"));
                } else if (occ.equals("Employee")) {
                    Employee emp = new Employee(name, id, occ, salary);
                    people.add(emp);
                    frame.add(new JLabel(Integer.toString(salary)));
                }
            }
        });
    }
}
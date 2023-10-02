public class Student extends PersonImpl{
    public Student(String name, String id, int salary) {
        super(name, id, "Student", salary);
    }

    @Override
    public String getOccupation() {
        return "Professor";
    }

    @Override
    public int getSalary() {
        return 0;
    }
}

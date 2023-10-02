public class Student extends PersonImpl{
    public Student(String name, String id) {
        super(name, id);
    }

    @Override
    public String getOccupation() {
        return "Student";
    }
}

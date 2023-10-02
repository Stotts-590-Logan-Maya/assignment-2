public class Professor extends PersonImpl{
    public Professor(String name, String id, int salary) {
        super(name, id, "Professor", salary);
    }

    @Override
    public String getOccupation() {
        return "Professor";
    }



}

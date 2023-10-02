public class Professor extends PersonImpl{
    public Professor(String name, String id) {
        super(name, id);
    }


    @Override
    public String getOccupation() {
        return "Professor";
    }
}

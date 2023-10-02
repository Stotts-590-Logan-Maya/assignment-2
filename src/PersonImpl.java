public class PersonImpl implements Person{
    private String name;
    private String id;
    private String occupation;
    private int salary;

    public PersonImpl(String name, String id, String occupation, int salary){
        this.name = name;
        this.id = id;
        this.occupation = occupation;
        this.salary = salary;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getID() {
        return this.id;
    }

    @Override
    public String getOccupation() {
        return this.occupation;
    }

    @Override
    public int getSalary() {
        return this.salary;
    }

        @Override
        public String getRank() {
            return null;
        }


}


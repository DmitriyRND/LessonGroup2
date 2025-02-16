package CollectionMap;

public class Employee {
    private int id;
    private String name;
    private String surname;
    private double salary;
    private Trainee trainee;


    public Employee(int id, String name, String surname, double salary, Trainee trainee) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.trainee = trainee;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Trainee getTrainee() {
        return trainee;
    }

    public void setTrainee(Trainee trainee) {
        this.trainee = trainee;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", trainee=" + (trainee != null ? trainee.getName() : "No Trainee") +
                '}';
    }
}

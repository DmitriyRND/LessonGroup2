package CollectionMap;

public class Trainee {
    private int id;
    private String name;
    private String surname;
    private RecordBook recordBook;


    public Trainee(int id, String name, String surname, RecordBook recordBook) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.recordBook = recordBook;
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

    public RecordBook getRecordBook() {
        return recordBook;
    }

    public void setRecordBook(RecordBook recordBook) {
        this.recordBook = recordBook;
    }


    @Override
    public String toString() {
        return "Trainee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", recordBook=" + recordBook +
                '}';
    }
}

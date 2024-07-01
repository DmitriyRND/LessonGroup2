package CollectionMap;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;


public class Main {
    public static void main(String[] args) {


        RecordBook recordBook1 = new RecordBook(1, 120, "Harvard University", Arrays.asList(5, 4, 3, 5, 4));
        RecordBook recordBook2 = new RecordBook(2, 90, "MIT", Arrays.asList(4, 3, 5, 4, 3));
        RecordBook recordBook3 = new RecordBook(3, 5, "Stanford University", Arrays.asList(5, 5, 5, 4, 5));
        RecordBook recordBook4 = new RecordBook(4, 110, "Oxford University", Arrays.asList(3, 4, 3, 4, 4));
        RecordBook recordBook5 = new RecordBook(5, 25, "РГСУ", Arrays.asList(4, 4, 4, 3, 4));
        RecordBook recordBook6 = new RecordBook(6, 130, "Yale University", Arrays.asList(5, 4, 4, 5, 4));
        RecordBook recordBook7 = new RecordBook(7, 140, "Princeton University", Arrays.asList(5, 3, 4, 5, 5));
        RecordBook recordBook8 = new RecordBook(8, 16, "РГСУ", Arrays.asList(4, 5, 5, 4, 4));
        RecordBook recordBook9 = new RecordBook(9, 95, "University of Chicago", Arrays.asList(3, 3, 4, 3, 4));
        RecordBook recordBook10 = new RecordBook(10, 105, "California Institute of Technology", Arrays.asList(5, 5, 4, 4, 5));


        Trainee trainee1 = new Trainee(1, "John", "Doe", recordBook1);
        Trainee trainee2 = new Trainee(2, "Jane", "Smith", recordBook2);
        Trainee trainee3 = new Trainee(3, "Michael", "Brown", recordBook3);
        Trainee trainee4 = new Trainee(4, "Emily", "Davis", recordBook4);
        Trainee trainee5 = new Trainee(5, "Daniel", "Wilson", recordBook5);
        Trainee trainee6 = new Trainee(6, "Laura", "Johnson", recordBook6);
        Trainee trainee7 = new Trainee(7, "Robert", "Jones", recordBook7);
        Trainee trainee8 = new Trainee(8, "Sophia", "Lee", recordBook8);
        Trainee trainee9 = new Trainee(9, "James", "Taylor", recordBook9);
        Trainee trainee10 = new Trainee(10, "Olivia", "Anderson", recordBook10);

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", "Wong", 60000, trainee1),
                new Employee(2, "Bob", "Kim", 55000, trainee2),
                new Employee(3, "Charlie", "Garcia", 70000, trainee3),
                new Employee(4, "David", "Martinez", 65000, trainee4),
                new Employee(5, "Eva", "Rodriguez", 72000, trainee5),
                new Employee(6, "Frank", "Smith", 58000, null),
                new Employee(7, "Grace", "Johnson", 61000, trainee7),
                new Employee(8, "Hannah", "Lee", 68000, trainee8),
                new Employee(9, "Ian", "Lopez", 73000, null),
                new Employee(10, "Jack", "Wilson", 69000, trainee10)
        );
        System.out.println("***всех сотрудников у которые есть стажеры (если не null)***");
                List<Employee> employeeListTrainee = employees.stream()
                .filter(employee -> employee.getTrainee() != null)
                .toList();
        employeeListTrainee.forEach(System.out::println);
                System.out.println("**********************************************");

        System.out.println("***всех сотрудников у которых стажеры обучаются более 30 дней***");
                List<Employee> employeeList30InternshipExperienceDay = employees.stream()
                .filter(employee -> employee.getTrainee() != null)
                .filter(employee -> employee.getTrainee().getRecordBook().getInternshipExperienceDay() >30)
                .toList();
        employeeList30InternshipExperienceDay.forEach(System.out::println);
        System.out.println("**********************************************");


        System.out.println("***всех сотрудников у которых стажеры из института РГСУ***");
        List<Employee> employeeListRGSY = employees.stream()
                .filter(employee -> employee.getTrainee() != null)
                .filter(employee -> employee.getTrainee().getRecordBook().getNameInstitute().equals("РГСУ"))
                .toList();
        employeeListRGSY.forEach(System.out::println);
        System.out.println("**********************************************");

        System.out.println("***получить новый лист сотрудников  стажеры которых учатся на  среднюю оценку 4-5***");
        //List<Employee> employeeListAverageEstimation = employees.stream()
        // не получается это задание(((
        System.out.println("**********************************************");

        System.out.println("***получить новый лист сотрудников  стажеры которых учатся на  среднюю оценку 4-5***");
        Trainee [] trainees = employees.stream()
                .filter(employee -> employee.getTrainee() != null)
                .map(Employee::getTrainee)
                .toArray(Trainee[]::new);
        Arrays.stream(trainees).forEach(System.out::println);
    }
}

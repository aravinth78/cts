import java.util.ArrayList;
import java.util.List;

public class StaffRecord {
    public record Employee(String name, double salary) {}

    public static void main(String[] args) {
        List<Employee> staff = new ArrayList<>();
        staff.add(new Employee("Alice", 55000));
        staff.add(new Employee("Bob", 42000));
        staff.add(new Employee("Carol", 61000));

        System.out.println("All employees:");
        for (Employee e : staff)
            System.out.println(e.name() + " earns " + e.salary());

        System.out.println("\nHigh earners (>50000):");
        staff.stream()
                .filter(e -> e.salary() > 50000)
                .forEach(e -> System.out.println(e.name()));
    }
}

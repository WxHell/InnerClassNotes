import java.util.Comparator;

public class Employee {
    private int emplıyeeId;
    private String name;
    private int yearStarted;



    public static class EmployeeComparator <T extends Employee >
            implements Comparator<Employee> {

        private String sortType;

        public EmployeeComparator() {
            this("name");
        }

        public EmployeeComparator(String sortType) {
            this.sortType = sortType;
        }

        @Override
        public int compare(Employee o1, Employee o2) {
           if (sortType.equalsIgnoreCase("yearStarted")){
               return o1.yearStarted -o2.yearStarted;
           }
            return o1.name.compareTo(o2.name);
        }
    }

    public Employee(int emplıyeeId, String name, int yearStarted) {
        this.emplıyeeId = emplıyeeId;
        this.name = name;
        this.yearStarted = yearStarted;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "%d %-8s %d".formatted(emplıyeeId,name,yearStarted);
    }
}

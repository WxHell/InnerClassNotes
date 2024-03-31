import java.util.Comparator;

public class StoreEmployee extends Employee{
    private String store;

    public StoreEmployee(int emplıyeeId, String name, int yearStarted, String store) {
        super(emplıyeeId, name, yearStarted);
        this.store = store;
    }

    @Override
    public String toString() {
        return "%-8s%s".formatted(store,super.toString());
    }

    public class StoreComparator <T extends  StoreEmployee>
    implements Comparator<StoreEmployee>{
        @Override
        public int compare(StoreEmployee o1, StoreEmployee o2) {
            int result = o1.store.compareTo(o2.store);
            return result;
        }
    }
}

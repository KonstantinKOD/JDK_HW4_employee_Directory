import java.util.ArrayList;
import java.util.List;

public class EmployeeDirectoryV2 {
    private final List<EmployeeV2> employers;

    public EmployeeDirectoryV2() {
        this.employers = new ArrayList<>();
    }

    public void add(EmployeeV2 employeeV2) {
        employers.add(employeeV2);
    }

    public List<EmployeeV2> findByExp(int yearExp) {
        return employers.stream().filter(e -> e.getExp() == yearExp).toList();
    }

    public List<Long> findPhoneNumByName(String name) {
        return employers.stream().filter(e -> e.name().equals(name)).map(EmployeeV2::phoneNum).toList();
    }

    public EmployeeV2 findById(int employeeId) {
        return employers.stream().filter(e -> e.employeeId() == employeeId).findFirst().orElse(null);
    }
}

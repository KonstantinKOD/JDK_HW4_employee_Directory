import java.time.LocalDate;
import java.time.Period;

public record EmployeeV2(int employeeId, long phoneNum, String name, LocalDate startJobDate) {

    public int getExp() {
        Period period = Period.between(startJobDate, LocalDate.now());
        return period.getYears();
    }
}

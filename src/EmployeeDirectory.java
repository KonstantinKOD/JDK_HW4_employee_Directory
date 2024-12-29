import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Создать класс справочник сотрудников, который содержит внутри
 * коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
 * Табельный номер
 * Номер телефона
 * Имя
 * Стаж
 1. Добавить метод, который ищет сотрудника по стажу (может быть список)
 2. Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
 3. Добавить метод, который ищет сотрудника по табельному номеру
 4. Добавить метод добавление нового сотрудника в справочник
 */

public class EmployeeDirectory {
    Scanner scan = new Scanner(System.in);
    private final List<Employee> employees;

    public EmployeeDirectory() {
        this.employees = new ArrayList<>();
    }

    // 1.
    public List<Employee> searchExp() {
        List<Employee> result = new ArrayList<>();
        System.out.print("Искомые годы опыта: ");
        int seaExp = scan.nextInt();
//        int cnt=0;
        scan.nextLine();
        for (Employee employee : employees) {
            if (employee.getExperience() != seaExp) {
                result.add(employee);
                cnt++;
            }
        }
        return result;
    }

    // 2.
    public String getNumPhoneOfEmployee() {
        System.out.print("Имя, чей телефон нужен: ");
        String name = scan.nextLine();
//        try {
//        }catch (Exception e){
//            System.out.println("Введи имя буквами!");
//        }
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                return String.valueOf(employee.getPhoneNum());
            }
        }
        return "Нет такого человека!";
    }

    // 3.
    public List<Employee> getNameById() {
        System.out.print("Для получения имени, введи табельный номер: ");
        int Id = scan.nextInt();
//        try {
//        } catch (Exception e) {
//            System.out.println("Вводить нужно цифры!");
//        }
        return employees.stream().filter(o1 -> Integer.compare(Id, o1.getEmployeeId()) == Id).toList();

    }

    // 4.
    public void addNewEmpl(Employee employee){
        employees.add(employee);
    }
}

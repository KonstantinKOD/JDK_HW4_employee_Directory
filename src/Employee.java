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

public class Employee {
    private int employeeId;
    private long phoneNum;
    private String name;
    private int experience;

    public Employee(int employeeId, long phoneNum, String name, int experience) {
        this.employeeId = employeeId;
        this.phoneNum = phoneNum;
        this.name = name;
        this.experience = experience;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public long getPhoneNum() {
        return phoneNum;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Данные сотрудника:" +
                "\nТабельный номер = " + employeeId +
                ",\nНомер телефона = " + phoneNum +
                ",\nИмя = " + name +
                ",\nСтаж = \n" + experience;
    }
}

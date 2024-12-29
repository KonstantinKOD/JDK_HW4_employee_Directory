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

public class Main {
    public static void main(String[] args) {
        EmployeeDirectory directory = new EmployeeDirectory();

        // 4.
        directory.addNewEmpl(new Employee(1,89602978143L,"Константин",5));
        directory.addNewEmpl(new Employee(2,89111255058L,"Марина",1));
        directory.addNewEmpl(new Employee(3,89004130562L,"Раиса",4));
        directory.addNewEmpl(new Employee(4,89211225058L,"Дмитрий",6));


        // 1.
        System.out.println(directory.searchExp());

        // 2.
        System.out.println(directory.getNumPhoneOfEmployee());

        // 3.
        System.out.println(directory.getNameById());
    }
}
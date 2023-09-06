package gb.unit3;

import java.util.Collections;
import java.util.List;

public class Main {
        public static void main(String[] args) {

            MyForEachListEmployee<Employee> commonStorage = new MyForEachListEmployee<>();


            System.out.println("--- Рабочие ---");

            List<Employee> employees = Worker.getEmployees(5);
            commonStorage.add(employees);
            System.out.println("--- Сортировка по среднемесячной заработной плате (встроенная в класс)");
            Collections.sort(employees);
            for (Employee employee: employees) {
                System.out.println(employee);
            }
            System.out.println("--- Сортировка по фамилии и имени");
            Collections.sort(employees, new EmployeeNameComparator());
            for (Employee employee: employees) {
                System.out.println(employee);
            }
            System.out.println("--- Сортировка по фамилии и имени (внешняя)");
            Collections.sort(employees, new EmployeeAverageMonthSalaryComparator());
            for (Employee employee: employees) {
                System.out.println(employee);
            }

            System.out.println("--- Фрилансеры ---");

            employees = Freelancer.getEmployees(5);
            commonStorage.add(employees);
            System.out.println("--- Сортировка по среднемесячной заработной плате (встроенная в класс)");
            Collections.sort(employees);
            for (Employee employee: employees) {
                System.out.println(employee);
            }
            System.out.println("--- Сортировка по фамилии и имени");
            Collections.sort(employees, new EmployeeNameComparator());
            for (Employee employee: employees) {
                System.out.println(employee);
            }
            System.out.println("--- Сортировка по фамилии и имени (внешняя)");
            Collections.sort(employees, new EmployeeAverageMonthSalaryComparator());
            for (Employee employee: employees) {
                System.out.println(employee);
            }

            System.out.println("--- Все работники ---");
            for (Employee employee: commonStorage) {
                System.out.println(employee);
            }

        }
}
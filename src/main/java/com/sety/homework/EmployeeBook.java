package com.sety.homework;

import org.springframework.stereotype.Service;
import java.text.DecimalFormat;
import java.util.*;
@Service
public class EmployeeBook {
    private Map<String, Employee> employees = new HashMap<>(Map.of(
            "Попова Варвара Богдановна",
            new Employee("Попова Варвара Богдановна", 85_000, 5),
            "Петрова Елена Павловна",
            new Employee("Петрова Елена Павловна", 87_000, 2),
            "Васильев Денис Андреевич",
            new Employee("Васильев Денис Андреевич", 65_000, 1),
            "Лянге Александр Григорьевич",
            new Employee("Лянге Александр Григорьевич", 90_000, 3),
            "Кузнецов Александр Семенович",
            new Employee("Кузнцов Александр Семенович", 67_000, 4),
            "Скворцов Сергей Денисович",
            new Employee("Скворцов Сергей Денисович", 63_000, 4),
            "Александров Михаил Богданович",
            new Employee("Александров Михаил Богданович", 99_000, 2),
            "Карчемный Владимир Георгиевич",
            new Employee("Карчемный Владимир Георгиевич", 72_000, 1),
            "Юницин Сергей Михайлович",
            new Employee("Юницин Сергей Михайлович", 76_000, 5),
            "Рыбкин Данил Амвросиевич",
            new Employee("Рыбкин Данил Амвросиевич", 75_000, 3)
    ));



    public String findEmployeesMinimalSalary() {
        int min = Integer.MAX_VALUE;
        String fullName = "";
        for (Employee employee : employees.values()) {
            if (employee.getSalary() <= min) {
                min = employee.getSalary();
                fullName = employee.getFullName();
            }
        }
        return fullName;
    }

    public String findEmployeesMaximalSalary() {
        int max = Integer.MIN_VALUE;
        String fullName = "";
        for (Employee employee : employees.values()) {
            if (employee.getSalary() > max) {
                max = employee.getSalary();
                fullName = employee.getFullName();
            }
        }
        return fullName;
    }

    public String findAndPrintEmployeeById(int id) {
        String mapKey = "";
        for (Employee employee : employees.values()) {
            if (id == employee.getId()) {
                mapKey = employee.getFullName();
            }
        }
        return mapKey;
    }

    public int monthSumSalary() {
        int sum = 0;
        for (Employee employee : employees.values()) {
            sum = employee.getSalary() + sum;
        }
        return sum;
    }

    public String monthMiddleSalary(int sum) {
        return new DecimalFormat("###,###.##").format((double) sum / employees.size());
    }

    public String middleSalaryByDept(int deptOfEmployee) {
        if (deptOfEmployee >= 6 && deptOfEmployee < 1) {
            throw new RuntimeException();
        }
        int sumSalaries = 0;
        int deptsCounter = 0;
        for (Employee employee : employees.values()) {
            if (employee.getDept() == deptOfEmployee) {
                sumSalaries = employee.getSalary() + sumSalaries;
                deptsCounter++;
            }
        }
        return Double.toString(sumSalaries / deptsCounter);
    }
}

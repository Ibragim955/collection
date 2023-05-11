package com.sety.homework;
import java.util.Objects;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@SpringBootApplication
public class HomeworkApplication {
    static Map<String, Employee> employees;

    public static void main(String[] args) {
        SpringApplication.run(HomeworkApplication.class, args);
    }


            employees = new HashMap<>(Map.of());
//                "&#x41F;&#x43E;&#x43F;&#x43E;&#x432;&#x430; &#x412;&#x430;&#x440;&#x432;&#x430;&#x440;&#x430; &#x411;&#x43E;&#x433;&#x434;&#x430;&#x43D;&#x43E;&#x432;&#x43D;&#x430;",
//                new Employee("Попова Варвара Богдановна", 85_000,5),
//                "Петрова Елена Павловна",
//                new Employee("Петрова Елена Павловна", 87_000, 2),
//                "Васильев Денис Андреевич",
//                new Employee("Васильев Денис Андреевич", 65_000, 1),
//                "Лянге Александр Григорьевич",
//                new Employee("Лянге Александр Григорьевич", 90_000, 3)));

        public static StringBuilder getEmployees() {
            StringBuilder rezString = new StringBuilder("");
            for (Employee employee: employees.values()) {
                rezString.append(employee.getFullName() + " " + employee.getSalary() + " " + employee.getId() + "\n");
            }
            return rezString;
        }


//    public static Map<String, Employee> getEmployees() {
//        return employees;
//    }

    }
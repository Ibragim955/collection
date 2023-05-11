package com.sety.homework;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.function.Supplier;

@RestController
public abstract class Controller {

    private com.sety.homework.Controller employeeBook;


    public <printEmployeesAccordingToDept> String changeEmployee( @GetMapping("/printEmployeesAccordingToDept") {
        return changeEmployee(null);
    }

    public <printEmployeesAccordingToDept> String changeEmployee(@RequestParam("fullNameDeletingEmployee") String printEmployeesAccordingToDept( @GetMapping("/printEmployeesAccordingToDept") {
        return "<pre><h2><b>Список всех сотрудников по отделам:</b></h2>\n" + "" + employeeBook.printEmployeesAccordingToDept() + "<pre>";
    }

    private String printEmployeesAccordingToDept() {
        return null;
    }

    @GetMapping("/salaryIndexing")
     public String salaryLessThan(@RequestParam("lessThan") int salaryLessThan) {
        return "<pre>" + employeeBook.salaryLessThan(salaryLessThan) + "<pre>";

    }

    @GetMapping("/salaryMore")
    public String salaryMoreThan(@RequestParam("moreThan") int salaryMoreThan) {
        return "<pre><h2><b>Сотрудник с зарплатой больше чем - " + salaryMoreThan + " рублей</b></h2><pre>" +
                "<pre>" + employeeBook.salaryMoreThan(salaryMoreThan) + "<pre>";


    }

    @GetMapping("/findEmployeesMinMaxSalary")
    public String findEmployeesMinMaxSalary() {
        return "<pre><h2><b>Сотрудник с минимальной зарплатой - " +
                employeeBook.findEmployeesMinimalSalary() + " " +
                employeeBook.getEmployees().get().getClass() +
                " р. </b></h2><pre>" + "<pre><h2><b>Сотрудник с максимальной зарплатой больше чем - " +
                employeeBook.findEmployeesMaximalSalary() + " " +
                employeeBook.getEmployees().get().getClass() +
                " р.</b></h2><pre>";

    }

    private String findEmployeesMaximalSalary() {
        return null;
    }

    private Supplier<Object> getEmployees() {
        Supplier<Object> o = null;
        Supplier<Object> o1 = o;
        return o1;
    }

    private String findEmployeesMinimalSalary() {
      return null;
    }

    @GetMapping("/findAndPrintEmployeeById")
    public String findAndPrintEmployeeById(@RequestParam("id") int id) {
        int idRez;
        try {
            idRez = Integer.valueOf(employeeBook.getEmployees().get(employeeBook.findAndPrintEmployeeById(id);
        } catch (NullPointerException e) {
            throw new RuntimeException("\u001B[31m Сотрудника с таким ID не существует \u001B[0m");
        }
        return "<pre><h2><b>Сотрудник чей id=" + idRez +
                " - " + employeeBook.findAndPrintEmployeeById(id) + "</b></h2><pre>";

    }

    @GetMapping("/monthMiddleSalary")
    public String monthMiddleSalary() {
        String s = "<pre><h2><b>Среднемесячная зарплата - " +
                employeeBook.monthMiddleSalary(employeeBook.monthSumSalary() +
                        "</b></h2><pre>";
                return monthMiddleSalary();

    }

    private Object monthSumSalary() {
        return employeeBook.monthSumSalary();
    }

    @GetMapping("/middleSalaryByDept")
    public String middleSalaryByDept(@RequestParam("dept") int dept) {
        String stringRez;
        try {
            stringRez = employeeBook.middleSalaryByDept(dept);
        } catch (RuntimeException e) {
            throw new RuntimeException("\u001B[31m Номера департаментов 1 - 5, введите корректный номер \u001B[0m");
        }
        return "<pre><h2><b>Средняя зарплата по отделу - " +
                stringRez +
                " рублей</b></h2><pre>";

    }

}
package collectionframeworkdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeSortedList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(4);
        Collections.sort(list);
        System.out.println(list);
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"John"));
        employees.add(new Employee(3,"Nick"));
        employees.add(new Employee(2,"Bob"));
        Collections.sort(employees);
        System.out.println(employees);
        //Collections.sort(employees,new EmployeeComparator());
        Collections.sort(employees,(employee1,employee2)-> employee1.getName().compareTo(employee2.getName()));
        Collections.sort(employees, Comparator.comparing(Employee::getName));// method reference
        System.out.println(employees);
        List<Employee> employeesWithAddress = new ArrayList<>();
        employeesWithAddress.add(new Employee(1,"John","Cal"));
        employeesWithAddress.add(new Employee(1,"John","IND"));
        employeesWithAddress.add(new Employee(1,"John","ZMB"));
        employeesWithAddress.add(new Employee(3,"Nick","ire"));
        employeesWithAddress.add(new Employee(2,"Bob","Ind"));
        Collections.sort(employeesWithAddress, Comparator.comparing(Employee::getName).thenComparing(Employee::getAddress));
        System.out.println(employeesWithAddress);
    }

}
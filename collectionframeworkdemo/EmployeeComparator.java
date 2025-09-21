package collectionframeworkdemo;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee employee1, Employee employee2) {
        return employee1.getName().compareTo(employee2.getName());
    }
}
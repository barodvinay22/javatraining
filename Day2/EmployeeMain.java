public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee=new Employee();//Default COnsturctor
        System.out.println(employee);

        Employee employee1 = new Employee(1,"John",2000);// 3 Argument con
        System.out.println(employee1);

        Employee employee2 = new Employee(2,"Mary");// 2 ar
        System.out.println(employee2);
    }
}
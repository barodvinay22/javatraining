public class EmployeeComparisonTest {
    public static void main(String[] args) {
        Employee employee=new Employee();//Default COnsturctor
        System.out.println(employee);

        Employee employee1 = new Employee(1,"John",2000);// 3 Argument con
        System.out.println(employee1);

        Employee employee2 = new Employee(1,"Neil",2000);// 2 ar
        System.out.println(employee2);
        //if(employee1 == employee2)//comparing references false
        if(employee1.equals(employee2)){ // equals method will check content
            System.out.println("Employee is the same");
        }else{
            System.out.println("Employee is not the same");
        }


    }
}
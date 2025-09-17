public class EmployeeNullPointerHandling {
    public static void main(String[] args) {
        try{
            Employee emp = null;
            System.out.println(emp.toString());
        }
        catch(NullPointerException e){
            System.out.println("Value of emp is null");
        }
        finally{
            System.out.println("Inside finally block");
        }

    }
}
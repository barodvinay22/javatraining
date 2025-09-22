public class Employee{
    private int id;// 0
    private String name;//null
    private Integer salary;//null
    Employee(){// Default Constructor

    }
    Employee(int id, String name, int salary) {// Parameterized constructor
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    Employee(int id,String name){
        this.id = id;//this--> current class
        this.name = name;
    }

    @Override
    public String toString() {// toString method Object
        return "Employee Id= "+id+" Name = "+name+" Salary="+salary;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==this){
            return true;
        }
        Employee e=(Employee)obj;
        if(this.id==e.id && this.name.equals(e.name) && this.salary.equals(e.salary)) {
            return true;
        }
        return super.equals(obj);
    }
}
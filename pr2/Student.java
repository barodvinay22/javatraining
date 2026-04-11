//package pr2;

 public class Student {
    private String Name;
    private Integer Age;
    private Integer Rollnumber;

    Student()
    {
        Name="";
        Age=null;
        Rollnumber=null;
    }

    Student(String name,Integer age , Integer rollnumber)
    {
        this.Name = name;
        this.Age = age;
        this.Rollnumber = rollnumber;
    }

    public String getName()
    {
        return this.Name;
    }

    public void setName(String name)
    {
        this.Name = name;
    }

    public Integer getAge()
    {
        return this.Age;
    }

    public void setAge(Integer age)
    {
        this.Age = age;
    }

     public Integer getRollnumber()
     {
         return this.Rollnumber;
     }

     public void setRollnumber(Integer rollnumber)
     {
         this.Rollnumber = rollnumber;
     }

     @Override
     public String toString()
     {
         return "Student{Name='" + Name + "', Age=" + Age + ", Rollnumber = " + Rollnumber + "}";
     }

     public static void main(String [] args)
     {
         Student st1 = new Student("Dexter",10,22);
         System.out.println(st1);
     }
 }

package collectionframeworkdemo;

public class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    private String address;
    Employee(int id) {
        this.id = id;
    }
    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    Employee(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return  "Employee [id=" + id + ", name =" + name +", address ="+ address + "]";
    }

    @Override
    public int compareTo(Employee employee) {
        return this.id-employee.id;
    }
}
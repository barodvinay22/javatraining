package Java_assignment_Preethi.CollectionFramework_Assignment;

import java.io.Serializable;

public class Employee implements Serializable {

    //Serializable * Create a class User(id, name , address , password)
    // Write a code to save user object into the file and retrive the user object from the
    // file make sure password should not be saved inside file.

    public Integer id;
    public String name;
    public String address;
    public transient String password;

    //constructor for id field
    public Employee(Integer id) {
        this.id = id;
    }

    //getters
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

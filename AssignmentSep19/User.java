package AssignmentSep19;

import java.io.*;

class User implements Serializable {
    int id;
    String name;
    String address;
    transient String password;

    // Constructor for user details
    User(int id, String name, String address, String password) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.password = password;
    }

    // Print user details
    void printUser() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Password: " + password);  // This will be null after loading from file
    }
}
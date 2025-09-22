package Java_assignment_Preethi.CollectionFramework_Assignment;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SavaObjectToFile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your employee id: ");
        int id = sc.nextInt();
        sc.nextLine();
        Employee employee = new Employee(id);
        System.out.println("Enter your name: ");
        employee.setName(sc.nextLine());
        System.out.println("Enter your address: ");
        employee.setAddress(sc.nextLine());
        System.out.println("Enter password of your choice: ");
        employee.setPassword(sc.nextLine());

        try {
            FileOutputStream fileOutStream = new FileOutputStream("employeeDetailsFile.txt");
            ObjectOutputStream objectOutStream = new ObjectOutputStream(fileOutStream);
            objectOutStream.writeObject(employee);
            objectOutStream.close();
            fileOutStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

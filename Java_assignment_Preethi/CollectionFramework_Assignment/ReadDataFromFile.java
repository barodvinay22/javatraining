package Java_assignment_Preethi.CollectionFramework_Assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadDataFromFile {

    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("employeeDetailsFile.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Employee employee = (Employee) objectInputStream.readObject();
            System.out.println(employee);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}

package interfacedemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadingObjectFromFile {
    public static void main(String[] args) {
        try(FileInputStream fileIn=new FileInputStream("savingobject.txt");
            ObjectInputStream objectIn=new ObjectInputStream(fileIn);){
            Student obj=(Student)objectIn.readObject();
            System.out.println(obj);
        }catch (FileNotFoundException fileNotFoundException){
            System.out.println("File not found");

        } catch (IOException e) {
            System.out.println("I/O Error");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException");
        }

    }
}